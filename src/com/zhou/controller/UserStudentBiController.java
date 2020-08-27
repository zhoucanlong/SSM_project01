package com.zhou.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.UserStudentBi;
import com.zhou.service.UserStudentBiService;

@RequestMapping("/usb")
@Controller
public class UserStudentBiController {
	
	@Autowired
	UserStudentBiService userStudentBiService;
	
	@RequestMapping("/getallusb")
	public String getAllUSB(Map<String,Object> map){
		List<UserStudentBi> userStudentBis=userStudentBiService.getAllUserStudentBi("20170310331");
		map.put("usbs", userStudentBis);
		System.out.println(userStudentBis);
		return "userStudent/userStudent";
	}
	
	@RequestMapping("/getusbbynum")
	public String getUSBByNum(Map<String,Object> map,UserStudentBi userStudentBi){
		List<UserStudentBi> userStudentBis=userStudentBiService.getAllUserStudentBiByNum(userStudentBi, "20170310331");
		map.put("usbs", userStudentBis);
		System.out.println(userStudentBis);
		return "userStudent/userStudent";
	}
}
