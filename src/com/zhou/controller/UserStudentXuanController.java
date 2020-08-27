package com.zhou.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.UserStudentXuan;
import com.zhou.service.UserStudentXuanService;

@RequestMapping("/usx")
@Controller
public class UserStudentXuanController {
	
	@Autowired
	UserStudentXuanService userStudentXuanService;
	
	@RequestMapping("/getallusx")
	public String getAllUSX(Map<String,Object> map){
		List<UserStudentXuan> userStudentXuans=userStudentXuanService.getAllUSX("20170310331");
		map.put("usxs", userStudentXuans);
		System.out.println("usxs:"+userStudentXuans);
		return "userStudent/selectmessage";
	}
	
	@RequestMapping("/getusxbynum")
	public String getUSXByNum(Map<String,Object> map,UserStudentXuan userStudentXuan){
		List<UserStudentXuan> userStudentXuans=userStudentXuanService.getUSXByNum("20170310331", userStudentXuan);
		map.put("usxs", userStudentXuans);
		System.out.println("usxs:"+userStudentXuans);
		return "userStudent/selectmessage";
	}
	
}
