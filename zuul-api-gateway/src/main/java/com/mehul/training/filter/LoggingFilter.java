package com.mehul.training.filter;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * 
 * @author mehul8055
 *
 */
public class LoggingFilter extends ZuulFilter {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingFilter.class);
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// Real logic for filtering requests
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		String uri = request.getRequestURI();
		System.out.println("Request to " + uri + " made at {}" + new Date());
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}
}
