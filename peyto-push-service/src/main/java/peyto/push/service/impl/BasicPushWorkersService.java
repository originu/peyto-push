package peyto.push.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import peyto.push.dao.api.PushWorkersDAO;
import peyto.push.dto.PushWorkerDTO;
import peyto.push.service.api.PushWorkersService;

public class BasicPushWorkersService implements PushWorkersService {

	@Autowired
	private PushWorkersDAO	dao;

	@Override
	public int add(PushWorkerDTO pushWorker) {
		return dao.add( pushWorker );
	}

	@Override
	public List< PushWorkerDTO > getByWorkerId( String workerId ) {
		return dao.getByWorkerId( workerId );
	}

	@Override
	public int deleteByWorkerId( String workerId ) {
		return dao.deleteByWorkerId( workerId );
	}

	@Override
	public int deleteAll() {
		return dao.deleteAll();
	}
	
}
