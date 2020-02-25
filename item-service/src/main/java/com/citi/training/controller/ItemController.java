/**
 * 
 */
package com.citi.training.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.citi.training.model.Item;
import com.citi.training.service.ItemService;

/**
 * @author Admin
 *
 */
@RestController
public class ItemController {

	@Autowired
	private ItemService service;
	
	@GetMapping(path = "/item/{code}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Item> getItem(@PathVariable("code") Long code) {
		Optional<Item> opt = service.getItemById(code);
		ResponseEntity<Item> resp = new ResponseEntity<>(opt.get(), HttpStatus.OK);
		return resp;
	}
}
