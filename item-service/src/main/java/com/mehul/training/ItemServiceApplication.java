package com.mehul.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

/**
 * 
 * @author mehul8055
 *
 */
@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	@Bean
	public Sampler getSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
