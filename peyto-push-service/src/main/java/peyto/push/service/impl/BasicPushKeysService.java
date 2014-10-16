package peyto.push.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import peyto.push.dao.api.PushKeysDAO;
import peyto.push.dto.PushKeyDTO;
import peyto.push.dto.PushKeyPaginationDTO;
import peyto.push.service.api.PushKeysService;

@Service( value="basicPushKeysService" )
public class BasicPushKeysService implements PushKeysService {

	@Autowired
	private PushKeysDAO	dao;
	
	@Override
	public int add( PushKeyDTO pushkey ) {
		return dao.add( pushkey );
	}

	@Override
	public PushKeyDTO get( String pushkey ) {
		return dao.get( pushkey );
	}

	@Override
	public List< PushKeyDTO > getItems( PushKeyPaginationDTO pagination ) {
		return dao.getItems( pagination );
	}

	@Override
	public int getSize() {
		return dao.getSize();
	}

	@Override
	public int delete( String pushkey ) {
		return dao.delete( pushkey );
	}

	@Override
	public int deleteAll() {
		return dao.deleteAll();
	}

	@Override
	public int deleteAllByAppId(String appId) {
		return dao.deleteAllByAppId( appId );
	}


	
}
