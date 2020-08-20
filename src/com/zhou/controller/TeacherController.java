package com.zhou.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.Teacher;
import com.zhou.service.TeacherService;


@RequestMapping("/teacher")
@Controller
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping("/getallteacher")
	public String getAllTeacher(Map<String,Object> map){
		List<Teacher> teachers=teacherService.getAllTeacher();
		map.put("teachers", teachers);
		return "teacher/teacher";
	}
	
	@RequestMapping("/getteacherbynumorpro")
	public String getTeacherByNumOrPro(Map<String,Object> map,Teacher teacher){
		List<Teacher> teachers=teacherService.getTeacherByNumOrPro(teacher);
		map.put("teachers", teachers);
		return "teacher/teacher";
	}
	
	@RequestMapping("/addteacher")
	public String addTeacher(Map<String,Object> map,Teacher teacher){
		int result=teacherService.addTeacher(teacher);
		List<Teacher> teachers=teacherService.getAllTeacher();
		map.put("teachers", teachers);
		return "teacher/teacher";
	}
	
	@RequestMapping("/deleteteacher")
	public String deleteTeacher(Map<String,Object> map,Teacher teacher){
		int result=teacherService.deleteTeacher(teacher);
		List<Teacher> teachers=teacherService.getAllTeacher();
		map.put("teachers", teachers);
		return "teacher/teacher";
	}
	
	@RequestMapping("/dispatchupdate")
	public String dispatchUpdate(Map<String,Object> map,Teacher teacher){
		List<Teacher> teachers=teacherService.getTeacherByNumOrPro(teacher);
		Teacher getTeacher=teachers.get(0);
		map.put("teacher", getTeacher);
		return "teacher/update";
	}
	
	@RequestMapping("/updateteacher")
	public String updateTeacher(Map<String,Object> map,Teacher teacher){
		int result=teacherService.updateTeacher(teacher);
		List<Teacher> teachers=teacherService.getAllTeacher();
		map.put("teachers", teachers);
		return "teacher/teacher";
	}
}
