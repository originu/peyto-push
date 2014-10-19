//package peyto.push.service.config;
//
//import java.io.File;
//import java.util.Properties;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
//import org.springframework.orm.hibernate4.HibernateTransactionManager;
//import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//
//@Configuration
//@EnableTransactionManagement
//public class TestHibernate4PersistenceConfig {
//
//	@Autowired
//	private DataSource	dataSource;
//	
//	/*
//	<bean id="sessionFactory" class="org.springframework.orm.hibernate4.LocalSessionFactoryBean">
//	    <property name="dataSource" ref="dataSource" />
//	    <property name="configLocation" value="classpath:hibernate.cfg.xml" />
//	</bean>
//	*/
//	/*
//	@Bean
//	public LocalSessionFactoryBean localSessionFactoryBean() {
//		LocalSessionFactoryBean	bean	= new LocalSessionFactoryBean();
//		bean.setDataSource( dataSource );
//		bean.setConfigLocation( new FileSystemResource( new File( "hibernate.cfg.xml" ) ) );
//		return bean;
//	}
//	*/
//	
//	/*
//	<tx:annotation-driven />
//	<bean id="transactionManager" class="org.springframework.orm.hibernate4.HibernateTransactionManager">
//	    <property name="sessionFactory" ref="sessionFactory" />
//	</bean>
//	*/
//	/*
//	@Bean
//	public HibernateTransactionManager hibernateTransactionManager() {
//		HibernateTransactionManager	manager	= new HibernateTransactionManager();
//		manager.setSessionFactory( localSessionFactoryBean().getObject() );
//		return manager;
//	}
//	*/
//	
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//		em.setDataSource( dataSource );
//		em.setPackagesToScan( new String[] { "org.baeldung.persistence.model" } );
//		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//		em.setJpaVendorAdapter(vendorAdapter);
//		
//		Properties properties = new Properties();
//	    //properties.setProperty( "hibernate.hbm2ddl.auto", "create-drop" );
//	    properties.setProperty( "hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect" );
//		em.setJpaProperties( properties );
//		return em;
//	}
//	 
//	@Bean
//	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
//		JpaTransactionManager transactionManager = new JpaTransactionManager();
//		transactionManager.setEntityManagerFactory(emf);
//		return transactionManager;
//	}
//	 
//	@Bean
//	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//		return new PersistenceExceptionTranslationPostProcessor();
//	}
//
//}