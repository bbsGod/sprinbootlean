package com.icbc.springlean.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbc.springlean.dao.GainUserInforDao;
import com.icbc.springlean.domain.UserInfor;
import com.icbc.springlean.entry.RetEntry;

@Service
public class GainUserService {
	@Autowired
	GainUserInforDao gainUserInfor;
	
	public void GainUserInfor(){
		List<UserInfor> users = gainUserInfor.gainUser();
		for(UserInfor e : users){
			System.out.println(e.getId()+e.getUserName()+e.getUserAge()+e.getUserCountry());
		}
	}
}
