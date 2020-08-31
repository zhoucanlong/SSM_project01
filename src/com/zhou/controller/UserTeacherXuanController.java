package com.zhou.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.User;
import com.zhou.bean.UserTeacherBi;
import com.zhou.service.UserTeacherXuanService;

@RequestMapping("/utx")
@Controller
public class UserTeacherXuanController {

	@Autowired
	UserTeacherXuanService userTeacherXuanService;
	
	@RequestMapping("/getallutx")
	public String getAllUTX(Map<String,Object> map,HttpSession session){
		//��ȡ�洢��session�е��û���Ϣ
		User user=(User) session.getAttribute("user");
		String teacherNum=user.getUsernum();
		List<UserTeacherBi> list=userTeacherXuanService.getAllUTX(teacherNum);
		map.put("utbs", list);
		return "userTeacher/selectMessage";
	}
	
	@RequestMapping("/getutxbynum")
	public String getUTXByNum(Map<String,Object> map,UserTeacherBi userTeacherBi,HttpSession session){
		//��ȡ�洢��session�е��û���Ϣ
		User user=(User) session.getAttribute("user");
		String teacherNum=user.getUsernum();
		List<UserTeacherBi> list=userTeacherXuanService.getUTXByNum(userTeacherBi, teacherNum);
		map.put("utbs", list);
		return "userTeacher/selectMessage";
	}
	
	@RequestMapping("/updateutx")
	public String updateUTX(Map<String,Object> map,UserTeacherBi userTeacherBi,HttpSession session){
		//��ȡ�洢��session�е��û���Ϣ
		User user=(User) session.getAttribute("user");
		String teacherNum=user.getUsernum();
		int result=userTeacherXuanService.updateScore(userTeacherBi, teacherNum);
		UserTeacherBi bi=new UserTeacherBi();
		bi.setCourseNum(userTeacherBi.getCourseNum());
		//��ȡͬһ�γ�ѡ����Ϣ
		List<UserTeacherBi> list=userTeacherXuanService.getUTXByNum(bi, teacherNum);
		map.put("utbs", list);
		return "userTeacher/selectMessage";
	}
}
