package org.cd.service;


import java.util.List;

import org.cd.bo.TiposVinos;
import org.cd.dao.IGenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CDService")
public class CDService{

	@Autowired
	private IGenericDAO<TiposVinos> tp;
	@Autowired
	private ExternalService externalService;
	
	
	public List<TiposVinos> getAllTiposVinos(){
		return tp.getAll();
	}
	
	public void removeTiposVinos(int id) {
		tp.remove(id);
	}

	public void addTiposVinos(TiposVinos t) {
		tp.saveOrUpdate(t);
	}

	public TiposVinos find(int id){
		return tp.find(id);
	}
	
	public int getPrice(int idTipoVino){
		return externalService.getStocks(idTipoVino);
	}
}



