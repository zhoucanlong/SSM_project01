package com.zhou.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.User;
import com.zhou.bean.UserTeacherBi;
import com.zhou.service.UserTeacherBiService;

@RequestMapping("/utb")
@Controller
public class UserTeacherBiController {
		
	@Autowired
	UserTeacherBiService userTeacherBiService;
	
	//获取所有的学生成绩信息
	@RequestMapping("/getallutb")
	public String getAllUTB(Map<String,Object> map,HttpSession session){
		//获取存储在session中的用户信息
		User user=(User) session.getAttribute("user");
		String teacherNum=user.getUsernum();
		List<UserTeacherBi> list=userTeacherBiService.getAllUTB(teacherNum);
		map.put("utbs", list);
		return "userTeacher/userTeacher";
	}
	
	//获取查询的学生信息
	@RequestMapping("/getutbbynum")
	public String getUTBBynum(Map<String,Object> map,UserTeacherBi userTeacherBi,HttpSession session){
		//获取存储在session中的用户信息
		User user=(User) session.getAttribute("user");
		String teacherNum=user.getUsernum();
		List<UserTeacherBi> list=userTeacherBiService.getUTBByNum(teacherNum, userTeacherBi);
		map.put("utbs", list);
		return "userTeacher/userTeacher";
	}
	
	//修改学生成绩
	@RequestMapping("/updatescore")
	public String updateScore(Map<String,Object> map,UserTeacherBi userTeacherBi,HttpSession session){
		//获取存储在session中的用户信息
		User user=(User) session.getAttribute("user");
		String teacherNum=user.getUsernum();
		int result=userTeacherBiService.updateStudentScore(userTeacherBi);
		System.out.println(userTeacherBi);
		UserTeacherBi utb=new UserTeacherBi();
		utb.setClassNum(userTeacherBi.getClassNum());
		List<UserTeacherBi> list=userTeacherBiService.getUTBByNum(teacherNum, utb);
		map.put("utbs", list);
		return "userTeacher/userTeacher";
	}
}
