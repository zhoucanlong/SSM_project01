package com.zhou.dao;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.User;

public interface UserDao {
	
	//ע���˺�
	public int regist(@Param("user")User user);
	
	//��¼�˺�
	public User login(@Param("username")String username,@Param("password")String password);
	
	//��ѯĳ�˺�
	public User exit(String username);
	
}
