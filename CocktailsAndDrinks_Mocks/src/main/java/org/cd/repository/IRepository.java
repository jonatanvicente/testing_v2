package org.cd.repository;

import java.util.List;

import org.cd.bo.TiposVinos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("IRepository")
public interface IRepository<T> extends CrudRepository<TiposVinos, Integer> {


/*	List<T> findAllById_Vino(int id);*/
	//public List<T> getAll();

/*	public T find(int id);
	public void remove(int id);
	public void saveOrUpdate(T t);*/

	
}