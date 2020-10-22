package org.cd.controller;

import java.util.List;

import org.cd.bo.TiposVinos;
import org.cd.service.CDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CDController {

	@Autowired
	private CDService service;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "hola pp";
	}

	@RequestMapping(value = "/vino/all", method = RequestMethod.GET)
	public ResponseEntity<List<TiposVinos>> types() {
/*
		List<TiposVinos> list = service.getAllTiposVinos();
		return ResponseEntity.ok(list);*/

		return null;
	}
	 
}
