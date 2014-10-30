package peyto.push.service.api;

import peyto.push.dto.PushServerDTO;

public interface PushServersService {

	int add(PushServerDTO pushServer);

	PushServerDTO getByServerId(String serverId);
	
	int deleteByServerId(String serverId);
	int deleteAll();
}
