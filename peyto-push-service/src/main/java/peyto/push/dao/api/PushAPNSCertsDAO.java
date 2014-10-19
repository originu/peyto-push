package peyto.push.dao.api;

import org.springframework.stereotype.Repository;

import peyto.push.dto.PushAPNSCertDTO;

@Repository
public interface PushAPNSCertsDAO {

	public int add( PushAPNSCertDTO pushAPNSCert );

	public PushAPNSCertDTO getByAppId( String appId );

	public int deleteByAppId( String appId );

	public int deleteAll();

}
