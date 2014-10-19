package peyto.push.dao.api;

import java.util.List;

import org.springframework.stereotype.Repository;

import peyto.push.dto.PushGCMCertDTO;

@Repository
public interface PushGCMCertsDAO {

	public int add( PushGCMCertDTO pushGCMCert );

	public PushGCMCertDTO getByAppId(String appId);

	public int deleteByAppId(String appId);

	public int deleteAll();

	public List< PushGCMCertDTO > getAll();

}
