package peyto.push.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import peyto.push.dao.api.PushAPNSCertsDAO;
import peyto.push.dto.PushAPNSCertDTO;
import peyto.push.service.api.PushAPNSCertsService;

@Service( "basicPushAPNSCertsService" )
public class BasicPushAPNSCertsService implements PushAPNSCertsService {

	@Autowired
	private PushAPNSCertsDAO	dao;

	@Override
	public int add( PushAPNSCertDTO pushAPNSCert ) {
		return dao.add( pushAPNSCert );
	}

	@Override
	public PushAPNSCertDTO getByApnsCertId(int apnsCertId) {
		return dao.getByApnsCertId( apnsCertId );
	}

	@Override
	public int deleteByApnsCertId(int apnsCertId) {
		return dao.deleteByApnsCertId( apnsCertId );
	}
	
	@Override
	public int deleteAll() {
		return dao.deleteAll();
	}
	
}
