package com.zhou.service;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.User;

public interface UserService {
	
	//×¢²áÕËºÅ
	public int regist(User user);
	
	//²éÑ¯Ä³ÕËºÅ
	public int exit(String username);
	
	//µÇÂ¼ÕËºÅ
	public User login(String username,String password);
	
}
