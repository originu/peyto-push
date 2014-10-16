package peyto.push.dao.api;

import java.util.List;

import org.springframework.stereotype.Repository;

import peyto.push.dto.PushKeyDTO;
import peyto.push.dto.PushKeyPaginationDTO;

@Repository
public interface PushKeysDAO {

	public int add(PushKeyDTO pushkey);

	public PushKeyDTO get(String pushkey);
	public List<PushKeyDTO> getItems(PushKeyPaginationDTO pagination);
	public int getSize();

	public int delete(String pushkey);

	public int deleteAll();

	public int deleteAllByAppId(String appId);

}
