/**
 * 
 */
package com.mehul.training.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mehul.training.model.Item;

/**
 * @author Admin
 *
 */
@FeignClient("item-service")
public interface ItemProxy {

	@GetMapping("/item/{code}")
	public Item getItem(@PathVariable("code") Long code);
}
