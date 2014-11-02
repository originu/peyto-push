package peyto.push.service.api;

import java.util.List;

import peyto.push.dto.PushWorkerDTO;

public interface PushWorkersService {

	public int add(PushWorkerDTO pushWorker);

	public List<PushWorkerDTO> getByWorkerId(String workerId);

	public int deleteByWorkerId(String workerId);

	public int deleteAll();
}
