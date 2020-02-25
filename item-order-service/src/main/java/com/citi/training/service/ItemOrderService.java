/**
 * 
 */
package com.citi.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.citi.training.model.Item;
import com.citi.training.model.ItemOrder;

/**
 * @author Admin
 *
 */
@Service
public class ItemOrderService {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private ItemProxy proxy;

	public ItemOrder placeOrder(Long code, int qnt) {
		String url = "http://localhost:8080/item/" + code;
		Item item = template.getForObject(url, Item.class);
		double totalPrice = item.getPrice() * qnt;
		return new ItemOrder(1l, item.getCode(), item.getName(), totalPrice);
	}

	public ItemOrder placeOrderThroughFeign(Long code, int qnt) {
		Item item = proxy.getItem(code);
		double totalPrice = item.getPrice() * qnt;
		return new ItemOrder(1l, item.getCode(), item.getName(), totalPrice);
	}
}
