package peyto.push.service.api;

import peyto.push.dto.PushGCMCertDTO;

public interface PushGCMCertsService {

	public int add( PushGCMCertDTO pushGCMCert );

	public PushGCMCertDTO getByGcmCertId(int gcmCertId);

	public int deleteByGcmCertId(int gcmCertId);

	public int deleteAll();

}
