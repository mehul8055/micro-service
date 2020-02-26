package com.mehul.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author mehul8055
 *
 */
@SpringBootApplication
@EnableFeignClients
public class ItemOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemOrderServiceApplication.class, args);
	}

	/*
	 * 
	 * Might not need now as Feign will take care of this
	 */
	@Bean
	public RestTemplate createRestTemplate() {
		return new RestTemplate();
	}
}
