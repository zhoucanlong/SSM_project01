package com.zhou.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.User;
import com.zhou.bean.UserStudentBi;
import com.zhou.service.UserStudentBiService;

@RequestMapping("/usb")
@Controller
public class UserStudentBiController {
	
	@Autowired
	UserStudentBiService userStudentBiService;
	
	@RequestMapping("/getallusb")
	public String getAllUSB(Map<String,Object> map,HttpSession session){
		//获取存储在session中的用户信息
		User user=(User) session.getAttribute("user");
		String stuNum=user.getUsernum();
		List<UserStudentBi> userStudentBis=userStudentBiService.getAllUserStudentBi(stuNum);
		map.put("usbs", userStudentBis);
		System.out.println(userStudentBis);
		return "userStudent/userStudent";
	}
	
	@RequestMapping("/getusbbynum")
	public String getUSBByNum(Map<String,Object> map,UserStudentBi userStudentBi,HttpSession session){
		//获取存储在session中的用户信息
		User user=(User) session.getAttribute("user");
		String stuNum=user.getUsernum();
		List<UserStudentBi> userStudentBis=userStudentBiService.getAllUserStudentBiByNum(userStudentBi, stuNum);
		map.put("usbs", userStudentBis);
		System.out.println(userStudentBis);
		return "userStudent/userStudent";
	}
}
