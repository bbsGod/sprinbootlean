package com.icbc.springlean;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.icbc.springlean.controller.GainUserController;
import com.icbc.springlean.start.SpringleanApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringleanApplication.class)
public class SpringleanApplicationTests {
	private static final Logger log = LoggerFactory.getLogger(SpringleanApplicationTests.class);
	

	
	@Before
	public void init(){
		log.info("开始测试===========");
	}
	
	@After
	public void after(){
		log.info("结束测试===========");
	}

}
