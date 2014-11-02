package peyto.push.dao.api;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import peyto.push.dto.PushWorkerCertDTO;

@Repository
public interface PushWorkersCertsDAO {

	public int add( PushWorkerCertDTO pushWorkerCert );

	public List< PushWorkerCertDTO > getByWorkerId( String workerId );

	public List< PushWorkerCertDTO > getByWorkerIdAndAppId( @Param( "workerId" ) String workerId, @Param( "appId" ) String appId );

	public int deleteByWorkerIdAndAppId( String workerId, String appId );

	public int deleteAll();

}
