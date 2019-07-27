package com.icbc.springlean.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.icbc.springlean.SpringleanApplicationTests;
import com.icbc.springlean.service.GainUserService;
import com.icbc.springlean.start.SpringleanApplication;

public class GainUserServiceTest extends SpringleanApplicationTests {
	@Autowired
	GainUserService gainUser;
	
	@Test
	public void gainUerTest(){
		gainUser.GainUserInfor();
	}

}
