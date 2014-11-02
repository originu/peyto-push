package peyto.push.service.api;

import java.util.List;

import peyto.push.dto.PushWorkerCertDTO;

public interface PushWorkersCertsService {

	public int add(PushWorkerCertDTO pushWorkerCert);

	public List<PushWorkerCertDTO> getByWorkerId(String workerId);

	public int deleteByWorkerIdAndAppId(String workerId, String appId);

	public int deleteAll();

}
