package com.icbc.springlean.controller;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.icbc.springlean.SpringleanApplicationTests;

public class GainUserControllerTest extends SpringleanApplicationTests {
	private static final Logger log = LoggerFactory.getLogger(GainUserControllerTest.class);
	@Autowired
	public GainUserController testController;
	@Value("${myProps.name}")
	String name;
	
	@Test
	public void contextLoads() {
		log.info("msg:"+"helloWord:"+name);
		testController.xx();
	}
	
}
