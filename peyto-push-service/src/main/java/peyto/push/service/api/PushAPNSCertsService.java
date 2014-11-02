package peyto.push.service.api;

import peyto.push.dto.PushAPNSCertDTO;

public interface PushAPNSCertsService {

	public int add( PushAPNSCertDTO pushAPNSCert );

	public PushAPNSCertDTO getByApnsCertId( int apnsCertId );

	public int deleteByApnsCertId( int apnsCertId );

	public int deleteAll();

}
