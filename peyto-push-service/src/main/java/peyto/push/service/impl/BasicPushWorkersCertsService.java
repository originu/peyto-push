package peyto.push.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import peyto.push.dao.api.PushWorkersCertsDAO;
import peyto.push.dto.PushWorkerCertDTO;
import peyto.push.service.api.PushWorkersCertsService;

public class BasicPushWorkersCertsService implements PushWorkersCertsService {

	@Autowired
	private PushWorkersCertsDAO	dao;

	@Override
	public int add(PushWorkerCertDTO pushWorkerCert) {
		return dao.add( pushWorkerCert );
	}

	@Override
	public List<PushWorkerCertDTO> getByWorkerId( String workerId ) {
		return dao.getByWorkerId( workerId );
	}

	@Override
	public int deleteByWorkerIdAndAppId( String workerId, String appId ) {
		return dao.deleteByWorkerIdAndAppId( workerId, appId );
	}

	@Override
	public int deleteAll() {
		return dao.deleteAll();
	}

	public List<PushWorkerCertDTO> getByWorkerIdAndAppId(String workerId, String appId) {
		return dao.getByWorkerIdAndAppId( workerId, appId );
	}
	
}
