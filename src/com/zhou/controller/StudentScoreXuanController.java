package com.zhou.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.StudentScoreXuan;
import com.zhou.service.StudentScoreXuanService;

@RequestMapping("/studentscorexuan")
@Controller
public class StudentScoreXuanController {

	@Autowired
	StudentScoreXuanService studentScoreXuanService;
	
	@RequestMapping("/getallssx")
	public String getAllSSX(Map<String,Object> map){
		List<StudentScoreXuan> studentScoreXuans=studentScoreXuanService.getAll();
		System.out.println("getall:"+studentScoreXuans);
		map.put("studentScoreXuans", studentScoreXuans);
		return "studentScoreXuan/studentScoreXuan";
	}
	
	@RequestMapping("/getssxbynum")
	public String getSSXByNum(Map<String,Object> map,StudentScoreXuan studentScoreXuan){
		List<StudentScoreXuan> studentScoreXuans=studentScoreXuanService.getSSXByNum(studentScoreXuan);
		map.put("studentScoreXuans", studentScoreXuans);
		return "studentScoreXuan/studentScoreXuan";
	}
	
	@RequestMapping("/addssx")
	public String addSSX(Map<String,Object> map,StudentScoreXuan studentScoreXuan){
		int result=studentScoreXuanService.addSSX(studentScoreXuan);
		List<StudentScoreXuan> studentScoreXuans=studentScoreXuanService.getAll();
		map.put("studentScoreXuans", studentScoreXuans);
		return "studentScoreXuan/studentScoreXuan";
	}
	
	@RequestMapping("/deletessx")
	public String deleteSSX(Map<String,Object> map,StudentScoreXuan studentScoreXuan){
		int result=studentScoreXuanService.deleteSSX(studentScoreXuan);
		List<StudentScoreXuan> studentScoreXuans=studentScoreXuanService.getAll();
		map.put("studentScoreXuans", studentScoreXuans);
		return "studentScoreXuan/studentScoreXuan";
	}
	
	@RequestMapping("/dispatchupdate")
	public String dispatchUpdate(Map<String,Object> map,StudentScoreXuan studentScoreXuan){
		List<StudentScoreXuan> studentScoreXuans=studentScoreXuanService.getSSXByNum(studentScoreXuan);
		StudentScoreXuan scoreXuan=studentScoreXuans.get(0);
		map.put("studentScoreXuan", scoreXuan);
		return "studentScoreXuan/update";
	}
	
	@RequestMapping("/updatessx")
	public String updateSSX(Map<String,Object> map,StudentScoreXuan studentScoreXuan){
		int result=studentScoreXuanService.updateSSX(studentScoreXuan);
		List<StudentScoreXuan> studentScoreXuans=studentScoreXuanService.getAll();
		map.put("studentScoreXuans", studentScoreXuans);
		return "studentScoreXuan/studentScoreXuan";
	}
	
}
