package com.mehul.training.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mehul.training.model.Item;

/**
 * 
 * @author mehul8055
 *
 */
@FeignClient("zuul-api-gateway")
@RibbonClient("item-service")
public interface ItemProxy {

	@GetMapping("/item-service/item/{code}")
	public Item getItem(@PathVariable("code") Long code);
}
