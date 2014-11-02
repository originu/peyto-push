package peyto.push.dao.api;

import java.util.List;

import org.springframework.stereotype.Repository;

import peyto.push.dto.PushWorkerDTO;

@Repository
public interface PushWorkersDAO {

	public int add(PushWorkerDTO pushWorker);

	public List<PushWorkerDTO> getByWorkerId(String workerId);

	public int deleteByWorkerId(String workerId);

	public int deleteAll();
}
