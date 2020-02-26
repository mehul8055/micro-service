package com.mehul.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehul.training.domain.Number;
import com.mehul.training.service.NumberService;

@RestController
public class NumberController {

	@Autowired
	private NumberService service;

	@GetMapping("/data")
	public ResponseEntity<Number> getNumber(){
		return new ResponseEntity<Number>(service.getNumber(), HttpStatus.OK);
	}
}
