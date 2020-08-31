package com.zhou.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.Student;
import com.zhou.bean.Teacher;
import com.zhou.bean.User;
import com.zhou.service.StudentService;
import com.zhou.service.TeacherService;
import com.zhou.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	TeacherService teacherService;
	//登录功能
	@RequestMapping("/login")
	public String login(Map<String,Object> map,User puser,HttpServletRequest request){
		HttpSession session=request.getSession();
		User user=userService.login(puser.getUsername(), puser.getPassword());
		String msg;
		if(user==null){
			msg="输入有误，请重新输入";
			map.put("msg", msg);
			return "user/login";
		}else{
			int level=user.getLevel();
			if(level==0){
				session.setAttribute("user", user);
				return "student/student";
			}
			else if(level==1){
				session.setAttribute("user", user);
				return "userStudent/userStudent";
			}
			else{
				session.setAttribute("user", user);
				return "userTeacher/userTeacher";
			}
		}
	}
	
	//注册功能
	@RequestMapping("/regist")
	public String regist(Map<String,Object> map,User user){
		    //返回给颜面的消息 
			String msg=null;
			//如果该用户已存在，则重新返回注册
			if(userService.exit(user.getUsername())==1){
				msg="该用户已存在";
				map.put("msg", msg);
				return "user/regist";
			}
			//如果是学生用户
			if(user.getLevel()==1){
				Student student=new Student();
				student.setStuNum(user.getUsernum());
				List<Student> list=studentService.getStudentByStuNum(student);
				//判断如果不存在该学生，则重新返回注册
				if(list.size()==0){
					msg="该学生不存在";
					map.put("msg", msg);
					return "user/regist";
				}
			}
			//如果是教师用户
			else if(user.getLevel()==2){
				Teacher teacher=new Teacher();
				teacher.setTeacherNum(user.getUsernum());
				List<Teacher> list=teacherService.getTeacherByNumOrPro(teacher);
				//判断如果不存在该教师，则重新返回注册
				if(list.size()==0){
					msg="该教师不存在";
					map.put("msg", msg);
					return "user/regist";
				}
			}
			else{
				msg="输入级别错误请重新输入";
				map.put("msg", msg);
				return "user/regist";
			}
			int result=userService.regist(user);

			if(result==0){
				msg="注册失败，请重新注册";
				map.put("msg", msg);
				return "user/regist";
			}else{
				return "user/login";
			}
			
		
	}
	
}
