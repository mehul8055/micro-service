package com.mehul.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mehul.training.model.Item;
import com.mehul.training.model.ItemOrder;

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
		return new ItemOrder(1l, item.getCode(), item.getName(), totalPrice, 8080);
	}

	public ItemOrder placeOrderThroughFeign(Long code, int qnt) {
		Item item = proxy.getItem(code);
		double totalPrice = item.getPrice() * qnt;
		return new ItemOrder(1l, item.getCode(), item.getName(), totalPrice, item.getPort());
	}
}
