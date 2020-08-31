package com.zhou.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.User;
import com.zhou.bean.UserStudentCenter;
import com.zhou.service.UserStudentCenterService;


@RequestMapping("/usc")
@Controller
public class UserStudentCenterController {
	
	@Autowired
	UserStudentCenterService userStudentCenterService;
	
	//��ȡ����UserStudentCenter��Ϣ
	@RequestMapping("/getallusc")
	public String getAllUSC(Map<String,Object> map,String term,HttpServletRequest request){
		List<UserStudentCenter> userStudentCenters=userStudentCenterService.getAllUSC();
		HttpSession session=request.getSession();
		//���term��Ϊ��
		if(term!=null){
			session.setAttribute("term", term);
		}else{
			session.setAttribute("term", "0");
		}
		map.put("uscs", userStudentCenters);
		return "userStudent/selectcenter";
	}
	
	//��ȡ����UserStudentCenter��Ϣ
	@RequestMapping("/getuscbyname")
	public String getUSCByName(Map<String,Object> map,UserStudentCenter userStudentCenter){
		List<UserStudentCenter> userStudentCenters=userStudentCenterService.getUSCByNum(userStudentCenter);
		map.put("uscs", userStudentCenters);
		return "userStudent/selectcenter";
	}
	
	//��ѡ����Ϣ��ӽ����ݿ�
	@RequestMapping("/selectcourse")
	public String selectCourse(Map<String,Object> map,UserStudentCenter userStudentCenter,HttpSession session){
		//��ȡ�洢��session�е��û���Ϣ
		User user=(User) session.getAttribute("user");
		String stuNum=user.getUsernum();
		Integer result=userStudentCenterService.addCourse(userStudentCenter, stuNum);
		List<UserStudentCenter> userStudentCenters=userStudentCenterService.getAllUSC();
		map.put("uscs", userStudentCenters);
		return "userStudent/selectcenter";
	}
}
