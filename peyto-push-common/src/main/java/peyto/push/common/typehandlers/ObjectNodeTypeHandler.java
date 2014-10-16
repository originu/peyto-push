package peyto.push.common.typehandlers;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObjectNodeTypeHandler implements TypeHandler< ObjectNode > {

	private static final Logger	logger	= LoggerFactory.getLogger( ObjectNode.class );
	
	private static ObjectMapper	om	= new ObjectMapper();
	
	@Override
	public void setParameter( PreparedStatement ps, int columnIndex, ObjectNode parameter, JdbcType jdbcType) throws SQLException {
		ps.setString( columnIndex, parameter.toString() );
	}

	@Override
	public ObjectNode getResult(ResultSet rs, String columnName) throws SQLException {
		return convert( rs.getString( columnName ) );
	}

	@Override
	public ObjectNode getResult(ResultSet rs, int columnIndex) throws SQLException {
		return convert( rs.getString( columnIndex ) );
	}

	@Override
	public ObjectNode getResult( CallableStatement cs, int columnIndex ) throws SQLException {
		return convert( cs.getString( columnIndex ) );
	}
	
	private ObjectNode convert( String data ) {
		if ( data != null ) {
			try {
				return om.readValue( data, ObjectNode.class );
			} catch (JsonParseException e) {
				logger.error( "error data=" + data, e );
			} catch (JsonMappingException e) {
				logger.error( "error data=" + data, e );
			} catch (IOException e) {
				logger.error( "error data=" + data, e );
			}
		}
		return null;
	}

}
