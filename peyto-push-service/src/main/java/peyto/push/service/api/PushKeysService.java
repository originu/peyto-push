package peyto.push.service.api;

import java.util.List;

import peyto.push.dto.PushKeyDTO;
import peyto.push.dto.PushKeyPaginationDTO;

public interface PushKeysService {

	int add(PushKeyDTO pushkey);

	PushKeyDTO get(String pushkey);

	int delete(String pushkey);

	int deleteAll();

	List<PushKeyDTO> getItems(PushKeyPaginationDTO pagination);

	int getSize();

	int deleteAllByAppId(String appId);

}
