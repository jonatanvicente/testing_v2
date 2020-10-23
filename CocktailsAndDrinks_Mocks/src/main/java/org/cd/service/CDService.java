package org.cd.service;


import java.util.List;

import org.cd.bo.Drink;
import org.cd.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CDService{

	@Autowired
	private IRepository tp;

	@Autowired
	private ExternalService externalService;
	
	
	public List<Drink> getAllTypes(){
		return tp.findAll();
	}
	

	public int getPrice(int idDrink){
		return externalService.getStocks(idDrink);
	}
}



