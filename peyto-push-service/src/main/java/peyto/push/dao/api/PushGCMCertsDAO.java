package peyto.push.dao.api;

import java.util.List;

import org.springframework.stereotype.Repository;

import peyto.push.dto.PushGCMCertDTO;

@Repository
public interface PushGCMCertsDAO {

	public int add( PushGCMCertDTO pushGCMCert );

	public PushGCMCertDTO getByGcmCertId(int gcmCertId);

	public int deleteByGcmCertId(int gcmCertId);

	public int deleteAll();

	public List< PushGCMCertDTO > getAll();

}
