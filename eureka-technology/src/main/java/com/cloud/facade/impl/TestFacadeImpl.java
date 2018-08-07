package com.cloud.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cloud.core.TestService;
import com.cloud.facade.TestFacade;

@Component
public class TestFacadeImpl implements TestFacade{

	@Autowired
	private TestService testService;
	
	@Override
	public String test(Integer id) {
		return testService.test(id);
	}

}
