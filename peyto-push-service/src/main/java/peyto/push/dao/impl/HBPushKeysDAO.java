package peyto.push.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import peyto.push.dao.api.PushKeysDAO;
import peyto.push.dto.PushKeyDTO;
import peyto.push.dto.PushKeyPaginationDTO;

public class HBPushKeysDAO implements PushKeysDAO {

	@PersistenceUnit
	private EntityManagerFactory	emf;

	
	@Override
	public int add(PushKeyDTO pushkey) {
		EntityManager em = emf.createEntityManager();
		Query createQuery = em.createQuery( "" );
		createQuery.setParameter( 1, category );
		return 0;
	}

	@Override
	public PushKeyDTO get(String pushkey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PushKeyDTO> getItems(PushKeyPaginationDTO pagination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String pushkey) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAllByAppId(String appId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
