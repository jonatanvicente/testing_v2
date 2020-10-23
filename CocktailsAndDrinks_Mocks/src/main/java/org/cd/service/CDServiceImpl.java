package org.cd.service;


import java.util.List;

import org.cd.bo.Drink;
import org.cd.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CDServiceImpl implements ICDService{

	@Autowired
	private IRepository tp;

	@Override
	public List<Drink> getAllTypes(){
		return tp.findAll();
	}

}



