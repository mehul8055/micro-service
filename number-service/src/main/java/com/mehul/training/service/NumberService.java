package com.mehul.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehul.training.NumberConfig;
import com.mehul.training.domain.Number;

@Service
public class NumberService {

	@Autowired
	private NumberConfig config;

	public Number getNumber() {
		return new Number(config.getMin(), config.getMax());
	}
}
