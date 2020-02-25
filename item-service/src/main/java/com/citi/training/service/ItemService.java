/**
 * 
 */
package com.citi.training.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.training.model.Item;
import com.citi.training.repository.ItemRepository;

/**
 * @author Admin
 *
 */
@Service
public class ItemService {

	@Autowired
	private ItemRepository repo;
	
	public Optional<Item> getItemById(Long id) {
		return repo.findById(id);
	}
		
}
