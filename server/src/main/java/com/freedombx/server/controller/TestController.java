package com.freedombx.server.controller;

import com.freedombx.core.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = {"/test"})
public class TestController {

	@Autowired
	TestService testService;

	/**
	 * Test
	 * 
	 * @throws Exception
	 */
	@RequestMapping(value = { "/hello" }, method = RequestMethod.GET)
	public String hello(@RequestParam(required = false, name = "u") String name) throws Exception {
		return testService.sayHello(name);
	}
}
