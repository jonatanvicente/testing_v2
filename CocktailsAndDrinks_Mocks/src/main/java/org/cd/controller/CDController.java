package org.cd.controller;

import java.util.List;

import org.cd.bo.Drink;
import org.cd.service.CDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CDController {

	@Autowired
	private CDService service;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "hello world";
	}

	@RequestMapping(value = "/drink/all", method = RequestMethod.GET)
	public ResponseEntity<List<Drink>> types() {

		List<Drink> types = service.getAllTypes();
		return types == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(types);
	}


}
