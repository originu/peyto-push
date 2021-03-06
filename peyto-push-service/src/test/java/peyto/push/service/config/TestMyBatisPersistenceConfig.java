package peyto.push.service.config;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan( 
		basePackages = "peyto.push.dao.api",
		annotationClass = Repository.class )
//@MapperScan( 
//		basePackages = "peyto.push.dao.api",
//		annotationClass = Repository.class,
//		sqlSessionFactoryRef = "mainSqlSessionFactory" )		// circular reference?
public class TestMyBatisPersistenceConfig {
	
	@Autowired
	private Environment	env;
	
	@Autowired
	@Qualifier( "mainDataSource" )
	private DataSource	dataSource;

	/*
	<bean id="peytoPushSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="peytoPushDataSource" />
		<property name="typeAliasesPackage"  value="peyto.push.dto" />
		<property name="typeHandlersPackage" value="peyto.push.common.typehandlers" />
		<property name="configLocation" value="file:${PEYTO_PUSH_HOME}/peyto.push.server.master/conf/orm/mybatis/sqlmapconfig.xml" />
		<property name="mapperLocations">
			<util:list>
				<value>file:${PEYTO_PUSH_HOME}/peyto.push.server.master/conf/orm/mybatis/mariadb/**.xml</value>
			</util:list>
		</property>
	</bean>
	*/	
	@Bean( name = "mainSqlSessionFactory" )
	public SqlSessionFactory mainSqlSessionFactory() throws Exception { 
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource( dataSource );
        sqlSessionFactory.setTypeAliasesPackage( "peyto.push.dto" );
        sqlSessionFactory.setTypeHandlersPackage( "peyto.push.common.typehandlers" );
        PathMatchingResourcePatternResolver	resolver	= new PathMatchingResourcePatternResolver();
        Resource	configLocation	= resolver.getResource( env.getProperty( "main.mybatis.config.location" ) );
        ArrayList< Resource >	mapLocations	= new ArrayList< Resource >();
        List< String >	items	= ( List< String > )env.getProperty( "main.mybatis.mapper.locations", List.class );
        for ( String item : items ) {
        	Resource[]	mapperLocations	= resolver.getResources( item );
        	for ( Resource mapLocation : mapperLocations ) {
				mapLocations.add( mapLocation );
			}
		}
        sqlSessionFactory.setConfigLocation( configLocation );
        sqlSessionFactory.setMapperLocations( mapLocations.toArray( new Resource[ mapLocations.size() ]) );
        return ( SqlSessionFactory ) sqlSessionFactory.getObject();
	}
	
	/*
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="sqlSessionFactoryBeanName" value="peytoPushSessionFactory" />
		<property name="basePackage" value="peyto.push.dao.api" />
		<!-- <property name="basePackage" value="peyto.push.**.dao.api" /> -->
	</bean>
	*/
	/*
	 * do not use
	@Bean
	@Qualifier( "mainMapperScannerConfigurer" )
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer	config	= new MapperScannerConfigurer();
		config.setBasePackage( "peyto.push.dao.api" );
		config.setAnnotationClass( Repository.class );
//		config.setSqlSessionFactoryBeanName( "mainSqlSessionFactory" );
		return config;
	}
	 */
	
	/* <bean id="peytoPushTransactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager" p:dataSource-ref="peytoPushDataSource" /> */
	@Bean( name = "mainTransactionManager" )
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager( dataSource );
	}
	
}