package com.mehul.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

/**
 * 
 * @author mehul8055
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}

	@Bean
	public Sampler getSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
