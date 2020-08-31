package com.zhou.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhou.bean.Student;
import com.zhou.service.StudentService;

@RequestMapping("/student")
@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	//获取单个学生信息
	@RequestMapping("/getstudent")
	public String getStudent(Map<String,Object> map,Student student){
		System.out.println(student);
		List<Student> students=studentService.getStudentByStuNum(student);
		map.put("students", students);
		return "student/student";
	}
	
	//获取所有学生信息
	@RequestMapping("/getallstudent")
	public String getAllStudent(Map<String,Object> map){
		List<Student> students=studentService.getAllStudent();
		map.put("students", students);
		return "student/student";
	}
	
	//添加学生信息
	@RequestMapping("/addstudent")
	public String updateOrAddStudent(Student student,Map<String,Object> map){
		System.out.println(student);
		//插入新数据
		int result=studentService.addStudent(student);
		List<Student> students=studentService.getAllStudent();
		map.put("students", students);
		return "student/student";
	}
	
	//转到修改页面显示
	@RequestMapping("/updatestudent")
	public String updateStudent(@RequestParam("stuNum")String stuNum,Map<String,Object> map){
		Student s=new Student();
		s.setStuNum(stuNum);
		//从数据库中找到这条数据
		List<Student> students=studentService.getStudentByStuNum(s);
		Student student=students.get(0);
		System.out.println(student);
		map.put("student", student);
		return "student/update";
		
	}
	
	//修改学生信息
	@RequestMapping("/updatefinish")
	public String updateFinish(Student student,Map<String,Object> map){
		System.out.println(student);
		int result=studentService.updateStudent(student);
		List<Student> students=studentService.getAllStudent();
		map.put("students", students);
		return "student/student";
	}
	
	//删除学生信息
	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("stuNum")String stuNum,Map<String,Object> map){
		int result=studentService.deleteStudent(stuNum);
		List<Student> students=studentService.getAllStudent();
		map.put("students", students);
		return "student/student";
	}
}
