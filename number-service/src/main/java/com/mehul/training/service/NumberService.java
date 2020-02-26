package com.mehul.training.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.mehul.training.domain.Number;

@Service
@RefreshScope
public class NumberService {

	@Value("${min}")
	private int min;

	@Value("${max}")
	private int max;

	public Number getNumber() {
		return new Number(min, max);
	}
}
