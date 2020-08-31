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
	//��¼����
	@RequestMapping("/login")
	public String login(Map<String,Object> map,User puser,HttpServletRequest request){
		HttpSession session=request.getSession();
		User user=userService.login(puser.getUsername(), puser.getPassword());
		String msg;
		if(user==null){
			msg="������������������";
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
	
	//ע�Ṧ��
	@RequestMapping("/regist")
	public String regist(Map<String,Object> map,User user){
		    //���ظ��������Ϣ 
			String msg=null;
			//������û��Ѵ��ڣ������·���ע��
			if(userService.exit(user.getUsername())==1){
				msg="���û��Ѵ���";
				map.put("msg", msg);
				return "user/regist";
			}
			//�����ѧ���û�
			if(user.getLevel()==1){
				Student student=new Student();
				student.setStuNum(user.getUsernum());
				List<Student> list=studentService.getStudentByStuNum(student);
				//�ж���������ڸ�ѧ���������·���ע��
				if(list.size()==0){
					msg="��ѧ��������";
					map.put("msg", msg);
					return "user/regist";
				}
			}
			//����ǽ�ʦ�û�
			else if(user.getLevel()==2){
				Teacher teacher=new Teacher();
				teacher.setTeacherNum(user.getUsernum());
				List<Teacher> list=teacherService.getTeacherByNumOrPro(teacher);
				//�ж���������ڸý�ʦ�������·���ע��
				if(list.size()==0){
					msg="�ý�ʦ������";
					map.put("msg", msg);
					return "user/regist";
				}
			}
			else{
				msg="���뼶���������������";
				map.put("msg", msg);
				return "user/regist";
			}
			int result=userService.regist(user);

			if(result==0){
				msg="ע��ʧ�ܣ�������ע��";
				map.put("msg", msg);
				return "user/regist";
			}else{
				return "user/login";
			}
			
		
	}
	
}
