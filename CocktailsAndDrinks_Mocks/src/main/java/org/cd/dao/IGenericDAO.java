package org.cd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("IGenericDAO")
public interface IGenericDAO<T>{

	public List<T> getAll();
	public T find(int id);
	public void remove(int id);
	public void saveOrUpdate(T t);

	
}