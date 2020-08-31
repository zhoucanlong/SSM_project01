package com.zhou.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.User;
import com.zhou.bean.UserStudentXuan;
import com.zhou.service.UserStudentXuanService;

@RequestMapping("/usx")
@Controller
public class UserStudentXuanController {
	
	@Autowired
	UserStudentXuanService userStudentXuanService;
	
	@RequestMapping("/getallusx")
	public String getAllUSX(Map<String,Object> map,HttpSession session){
		//获取存储在session中的用户信息
		User user=(User) session.getAttribute("user");
		String stuNum=user.getUsernum();
		List<UserStudentXuan> userStudentXuans=userStudentXuanService.getAllUSX(stuNum);
		map.put("usxs", userStudentXuans);
		System.out.println("usxs:"+userStudentXuans);
		return "userStudent/selectmessage";
	}
	
	@RequestMapping("/getusxbynum")
	public String getUSXByNum(Map<String,Object> map,UserStudentXuan userStudentXuan,HttpSession session){
		//获取存储在session中的用户信息
		User user=(User) session.getAttribute("user");
		String stuNum=user.getUsernum();
		List<UserStudentXuan> userStudentXuans=userStudentXuanService.getUSXByNum(stuNum, userStudentXuan);
		map.put("usxs", userStudentXuans);
		System.out.println("usxs:"+userStudentXuans);
		return "userStudent/selectmessage";
	}
	
}
