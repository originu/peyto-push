package peyto.push.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import peyto.push.dao.api.PushGCMCertsDAO;
import peyto.push.dto.PushGCMCertDTO;
import peyto.push.service.api.PushGCMCertsService;

@Service( "basicPushGCMCertsService" )
public class BasicPushGCMCertsService implements PushGCMCertsService {

	@Autowired
	private PushGCMCertsDAO		dao;

	@Override
	public int add( PushGCMCertDTO pushGCMCert ) {
		return dao.add( pushGCMCert );
	}

	@Override
	public PushGCMCertDTO getByGcmCertId(int gcmCertId) {
		return dao.getByGcmCertId( gcmCertId );
	}

	@Override
	public int deleteByGcmCertId(int gcmCertId) {
		return dao.deleteByGcmCertId( gcmCertId );
	}

	@Override
	public int deleteAll() {
		return dao.deleteAll();
	}
	
}
