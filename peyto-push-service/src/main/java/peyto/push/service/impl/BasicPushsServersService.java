package peyto.push.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import peyto.push.dao.api.PushServersDAO;
import peyto.push.dto.PushServerDTO;
import peyto.push.service.api.PushsServersService;

public class BasicPushsServersService implements PushsServersService {

	@Autowired
	private PushServersDAO	dao;
	
	@Override
	public int add(PushServerDTO pushServer) {
		return dao.add(pushServer);
	}

	@Override
	public PushServerDTO getByServerId(String serverId) {
		return dao.getByServerId(serverId);
	}

	@Override
	public int deleteByServerId(String serverId) {
		return dao.deleteByServerId(serverId);
	}

	@Override
	public int deleteAll() {
		return dao.deleteAll();
	}

}
