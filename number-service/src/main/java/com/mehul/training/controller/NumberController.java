package com.mehul.training.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehul.training.domain.Number;

/**
 * 
 * @author mehul8055
 *
 */
@RefreshScope
@RestController
public class NumberController {

	@Value("${min}")
	private int min;

	@Value("${max}")
	private int max;

	@GetMapping("/data")
	public ResponseEntity<Number> getNumber(){
		return new ResponseEntity<Number>(new Number(min, max), HttpStatus.OK);
	}
}
