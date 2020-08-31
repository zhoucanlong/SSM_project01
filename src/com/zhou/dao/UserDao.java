package com.zhou.dao;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.User;

public interface UserDao {
	
	//×¢²áÕËºÅ
	public int regist(@Param("user")User user);
	
	//µÇÂ¼ÕËºÅ
	public User login(@Param("username")String username,@Param("password")String password);
	
	//²éÑ¯Ä³ÕËºÅ
	public User exit(String username);
	
}
