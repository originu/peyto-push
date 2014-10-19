package peyto.push.service.api;

import peyto.push.dto.PushServerDTO;

public interface PushsServersService {

	int add(PushServerDTO pushServer);

	PushServerDTO getByServerId(String serverId);
	
	int deleteByServerId(String serverId);
	int deleteAll();
}
