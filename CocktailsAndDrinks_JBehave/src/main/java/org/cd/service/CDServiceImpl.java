package org.cd.service;


import org.cd.bo.Drink;
import org.cd.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CDServiceImpl implements ICDService{

	@Autowired
	private IRepository tp;

	@Override
	public List<Drink> getAllTypes(){
		return tp.findAll();
	}

}



