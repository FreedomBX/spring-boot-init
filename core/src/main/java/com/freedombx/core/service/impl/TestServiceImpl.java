package com.freedombx.core.service.impl;

import com.freedombx.core.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class TestServiceImpl implements TestService {

	@Override
	public String sayHello(String name) {
		return String.format("Hello %s!", name);
	}
}
