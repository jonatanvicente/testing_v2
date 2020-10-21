package org.cd.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.cd.bo.TiposVinos;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("TiposVinosDAO")
@Transactional
public class TiposVinosDAOImpl extends BaseDAO implements IGenericDAO<TiposVinos>{
	
	public List<TiposVinos> getAll() {
		return entityManager.createNamedQuery("CD.allTiposVinos", TiposVinos.class).getResultList();
	}

	public TiposVinos find(int id) {
		
		Query query = entityManager.createNamedQuery("CD.findTiposVinos");
		query.setParameter("id", id);
		return (TiposVinos)query.getSingleResult();
		
	}

	public void remove(int id) {
		TiposVinos tp = entityManager.find(TiposVinos.class, id);
		entityManager.remove(tp);
	}

	
	public void saveOrUpdate(TiposVinos t) {
		
		t = entityManager.merge(t);
		entityManager.persist(t);
	
	}
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
}