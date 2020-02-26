package com.mehul.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mehul.training.model.Item;
import com.mehul.training.service.ItemService;

/**
 * 
 * @author mehul8055
 *
 */
@RestController
public class ItemController {

	@Autowired
	private ItemService service;
	
	@GetMapping(path = "/item/{code}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Item> getItem(@PathVariable("code") Long code) {
		Item item = service.getItemById(code);
		ResponseEntity<Item> resp = new ResponseEntity<>(item, HttpStatus.OK);
		return resp;
	}
}
