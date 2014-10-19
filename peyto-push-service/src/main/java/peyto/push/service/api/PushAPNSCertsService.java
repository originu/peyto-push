package peyto.push.service.api;

import peyto.push.dto.PushAPNSCertDTO;

public interface PushAPNSCertsService {

	public int add( PushAPNSCertDTO pushAPNSCert );

	public PushAPNSCertDTO getByAppId( String appId );

	public int deleteByAppId( String appId );

	public int deleteAll();

}
