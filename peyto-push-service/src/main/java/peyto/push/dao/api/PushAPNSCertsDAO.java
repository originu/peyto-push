package peyto.push.dao.api;

import org.springframework.stereotype.Repository;

import peyto.push.dto.PushAPNSCertDTO;

@Repository
public interface PushAPNSCertsDAO {

	public int add( PushAPNSCertDTO pushAPNSCert );

	public PushAPNSCertDTO getByApnsCertId( int apnsCertId );

	public int deleteByApnsCertId( int apnsCertId );

	public int deleteAll();

}
