package com.zhou.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.StudentScoreBi;
import com.zhou.service.StudentScoreBiService;

@RequestMapping("/studentscorecontroller")
@Controller
public class StudentScoreBiController {
	
	@Autowired
	StudentScoreBiService studentScoreBiService;
	
	@RequestMapping("/getallssb")
	public String getAllSSB(Map<String,Object> map){
		List<StudentScoreBi> studentScoreBis=studentScoreBiService.getAllSSB();
		map.put("studentScoreBis", studentScoreBis);
		return "studentScoreBi/studentscorebi";
	}
	
	@RequestMapping("/getssbbynum")
	public String getSSBByNum(Map<String,Object> map,StudentScoreBi studentScoreBi){
		List<StudentScoreBi> studentScoreBis=studentScoreBiService.getSSBByNum(studentScoreBi);
		map.put("studentScoreBis", studentScoreBis);
		return "studentScoreBi/studentscorebi";
	}
	
	@RequestMapping("/addssb")
	public String addSSB(Map<String,Object> map,StudentScoreBi studentScoreBi){
		int resuly=studentScoreBiService.addSSB(studentScoreBi);
		List<StudentScoreBi> studentScoreBis=studentScoreBiService.getAllSSB();
		map.put("studentScoreBis", studentScoreBis);
		return "studentScoreBi/studentscorebi";
	}
	
	@RequestMapping("/deletessb")
	public String deleteSSB(Map<String,Object> map,StudentScoreBi studentScoreBi){
		int resuly=studentScoreBiService.deleteSSB(studentScoreBi);
		List<StudentScoreBi> studentScoreBis=studentScoreBiService.getAllSSB();
		map.put("studentScoreBis", studentScoreBis);
		return "studentScoreBi/studentscorebi";
	}
	
	@RequestMapping("/dispatchupdate")
	public String dispatchUpdate(Map<String,Object> map,StudentScoreBi studentScoreBi){
		List<StudentScoreBi> studentScoreBis=studentScoreBiService.getSSBByNum(studentScoreBi);
		StudentScoreBi getStudentScoreBi=studentScoreBis.get(0);
		map.put("studentScoreBi",getStudentScoreBi);
		return "studentScoreBi/update";
	}
	
	@RequestMapping("/updatessb")
	public String updateSSB(Map<String,Object> map,StudentScoreBi studentScoreBi){
		int result=studentScoreBiService.updateSSB(studentScoreBi);
		List<StudentScoreBi> studentScoreBis=studentScoreBiService.getAllSSB();
		map.put("studentScoreBis", studentScoreBis);
		return "studentScoreBi/studentscorebi";
	}
}
