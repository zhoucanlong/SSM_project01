package com.zhou.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.Course;
import com.zhou.service.CourseService;

@RequestMapping("/course")
@Controller
public class CourseController{
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/getallcourse")
	public String getAllCourse(Map<String,Object> map){
		List<Course> courses=courseService.getAllCourse();
		map.put("courses", courses);
		System.out.println(courses);
		return "course/course";
	}
	
	@RequestMapping("/getcoursebynum")
	public String getCourseByNum(Map<String,Object> map,Course course){
		Course getcourse=courseService.getCourseByNum(course);
		List<Course> courses=new ArrayList<Course>();
		courses.add(getcourse);
		map.put("courses", courses);
		System.out.println("getcoursebynum:"+courses);
		return "course/course";
	}
	
	@RequestMapping("/addcourse")
	public String addCourse(Map<String,Object> map,Course course){
		int result=courseService.addCourse(course);
		List<Course> courses=courseService.getAllCourse();
		map.put("courses", courses);
		System.out.println(courses);
		return "course/course";
	}
	
	@RequestMapping("/deletecourse")
	public String deleteCourse(Map<String,Object> map,Course course){
		int result=courseService.deleteCourse(course);
		List<Course> courses=courseService.getAllCourse();
		map.put("courses", courses);
		System.out.println(courses);
		return "course/course";
	}
	
	@RequestMapping("/dispatchcourse")
	public String dispatchCourse(Map<String,Object> map,Course course){
		Course getCourse=courseService.getCourseByNum(course);
		map.put("course", getCourse);
		return "course/update";
	}
	
	@RequestMapping("/updatecourse")
	public String updateCourse(Map<String,Object> map,Course course){
		int result=courseService.updateCourse(course);
		List<Course> courses=courseService.getAllCourse();
		map.put("courses", courses);
		System.out.println(courses);
		return "course/course";
	}
}
