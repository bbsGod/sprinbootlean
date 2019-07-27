package com.icbc.springlean.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.icbc.springlean.domain.UserInfor;

@Component
@Mapper
public interface GainUserInforDao {
	
	@Select("select id, user_name, user_age, user_country from user_infor")
	List<UserInfor> gainUser();
	
}
