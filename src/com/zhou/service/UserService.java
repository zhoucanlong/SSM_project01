package com.zhou.service;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.User;

public interface UserService {
	
	//ע���˺�
	public int regist(User user);
	
	//��ѯĳ�˺�
	public int exit(String username);
	
	//��¼�˺�
	public User login(String username,String password);
	
}
