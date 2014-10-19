package peyto.push.service.api;

import peyto.push.dto.PushGCMCertDTO;

public interface PushGCMCertsService {

	public int add( PushGCMCertDTO pushGCMCert );

	public PushGCMCertDTO getByAppId(String appId);

	public int deleteByAppId(String appId);

	public int deleteAll();

}
