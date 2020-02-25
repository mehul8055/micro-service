/**
 * 
 */
package com.mehul.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.mehul.training.model.Item;
import com.mehul.training.repository.ItemRepository;

/**
 * @author Admin
 *
 */
@Service
public class ItemService {

	@Autowired
	private ItemRepository repo;
	
	@Autowired
	private Environment env;

	public Item getItemById(Long id) {
		int port = Integer.parseInt(env.getProperty("local.server.port"));
		Item item = repo.findById(id).get();
		item.setPort(port);
		return item;
	}
		
}
