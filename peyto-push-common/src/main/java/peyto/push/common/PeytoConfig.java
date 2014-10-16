package peyto.push.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class PeytoConfig {

	@Value( "${main.db.driver.class.name}" )
	public String DB_DRIVER_CLASS_NAME;
	@Value( "${main.db.url}" )
	public String DB_URL;
	@Value( "${main.db.username}" )
	public String DB_USERNAME;
	@Value( "${main.db.password}" )
	public String DB_PASSWORD;

	@Value( "${main.jndi.name.datasource}" )
	public String JNDI_NAME_DATASOURCE;
	
	@Value( "${main.mybatis.config.location}" )
	public String MYBATIS_CONFIG_LOCATION;

	@Value( "${main.mybatis.mapper.locations}" )
	public List< String > MABATIS_MAPPER_LOCATIONS;
}
