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
	
	//��ȡ���е�ѧ���ɼ���Ϣ
	@RequestMapping("/getallutb")
	public String getAllUTB(Map<String,Object> map,HttpSession session){
		//��ȡ�洢��session�е��û���Ϣ
		User user=(User) session.getAttribute("user");
		String teacherNum=user.getUsernum();
		List<UserTeacherBi> list=userTeacherBiService.getAllUTB(teacherNum);
		map.put("utbs", list);
		return "userTeacher/userTeacher";
	}
	
	//��ȡ��ѯ��ѧ����Ϣ
	@RequestMapping("/getutbbynum")
	public String getUTBBynum(Map<String,Object> map,UserTeacherBi userTeacherBi,HttpSession session){
		//��ȡ�洢��session�е��û���Ϣ
		User user=(User) session.getAttribute("user");
		String teacherNum=user.getUsernum();
		List<UserTeacherBi> list=userTeacherBiService.getUTBByNum(teacherNum, userTeacherBi);
		map.put("utbs", list);
		return "userTeacher/userTeacher";
	}
	
	//�޸�ѧ���ɼ�
	@RequestMapping("/updatescore")
	public String updateScore(Map<String,Object> map,UserTeacherBi userTeacherBi,HttpSession session){
		//��ȡ�洢��session�е��û���Ϣ
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
