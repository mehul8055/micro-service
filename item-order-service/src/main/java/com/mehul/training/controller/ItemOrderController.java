package com.mehul.training.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mehul.training.model.ItemOrder;
import com.mehul.training.service.ItemOrderService;

/**
 * 
 * @author mehul8055
 *
 */
@RestController
public class ItemOrderController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ItemOrderController.class);

	@Autowired
	private ItemOrderService service;
	
	@GetMapping(path = "/itemorder/{code}/qnt/{qnt}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<ItemOrder> placeOrder(@PathVariable Long code, @PathVariable int qnt) {
		ItemOrder itemOrder = service.placeOrder(code, qnt);
		ResponseEntity<ItemOrder> resp = new ResponseEntity<>(itemOrder, HttpStatus.OK);
		return resp;
	}

	@GetMapping(path = "/item-order/{code}/qnt/{qnt}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<ItemOrder> placeOrderThroughFeign(@PathVariable Long code, @PathVariable int qnt) {
		ItemOrder itemOrder = service.placeOrderThroughFeign(code, qnt);
		ResponseEntity<ItemOrder> resp = new ResponseEntity<>(itemOrder, HttpStatus.OK);
		LOGGER.info("Inside Item Order Controller {}", itemOrder);
		return resp;
	}
}
