package com.moon.xfire.serviceImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.moon.xfire.service.MathService;

public class MathServiceImpl implements MathService {

		 private final Log log = LogFactory.getLog(MathServiceImpl.class);
		 public int add(int a, int b) {
		       log.info("invoke method add.");
		       return a + b;
		 }
	
}
