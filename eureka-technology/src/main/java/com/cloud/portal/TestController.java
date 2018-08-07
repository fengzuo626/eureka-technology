package com.cloud.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.facade.TestFacade;

@RestController
@RequestMapping(value = "test")
@CrossOrigin
public class TestController {

	@Autowired
	private TestFacade testFacade;
	
	@GetMapping("/test")
	public String test(@RequestParam (value = "id",required = false)Integer id) {
		return testFacade.test(id);
	}
}
