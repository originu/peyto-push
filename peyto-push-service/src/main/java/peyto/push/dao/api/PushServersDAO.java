package peyto.push.dao.api;

import org.springframework.stereotype.Repository;

import peyto.push.dto.PushServerDTO;

@Repository
public interface PushServersDAO {

	int add(PushServerDTO pushServer);

	PushServerDTO getByServerId(String serverId);
	
	int deleteByServerId(String serverId);
	
	int deleteAll();
}
