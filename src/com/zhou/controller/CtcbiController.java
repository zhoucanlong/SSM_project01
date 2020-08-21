package com.zhou.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.Ctcbi;
import com.zhou.service.CtcbiService;


@RequestMapping("/ctcbi")
@Controller
public class CtcbiController {
	
	@Autowired
	CtcbiService ctcbiService;
	
	@RequestMapping("/getallctcbi")
	public String getAllCtcbi(Map<String,Object> map){
		List<Ctcbi> ctcbis=ctcbiService.getAllCtcbi();
		map.put("ctcbis", ctcbis);
		return "ctcbi/ctcbi";
				
	}
	
	@RequestMapping("/getctcbibynum")
	public String getCtcbiByNum(Map<String,Object> map,Ctcbi ctcbi){
		List<Ctcbi> ctcbis=ctcbiService.getCtcbiByNum(ctcbi);
		map.put("ctcbis", ctcbis);
		return "ctcbi/ctcbi";
	}
	
	@RequestMapping("/addctcbi")
	public String addCtcbi(Map<String,Object> map,Ctcbi ctcbi){
		int result=ctcbiService.addCtcbi(ctcbi);
		List<Ctcbi> ctcbis=ctcbiService.getAllCtcbi();
		map.put("ctcbis", ctcbis);
		return "ctcbi/ctcbi";
	}
	
	@RequestMapping("/deletectcbi")
	public String deleteCtcbi(Map<String,Object> map,Ctcbi ctcbi){
		int result=ctcbiService.deleteCtcbi(ctcbi);
		List<Ctcbi> ctcbis=ctcbiService.getAllCtcbi();
		map.put("ctcbis", ctcbis);
		return "ctcbi/ctcbi";
	}
	
	@RequestMapping("/dispatchupdate")
	public String dispatchUpdate(Map<String,Object> map,Ctcbi ctcbi){
		List<Ctcbi> ctcbis=ctcbiService.getCtcbiByNum(ctcbi);
		Ctcbi getCtcbi=ctcbis.get(0);
		map.put("ctcbi", getCtcbi);
		return "ctcbi/update";
	}
	
	@RequestMapping("/updatectcbi")
	public String updateCtcbi(Map<String,Object> map,Ctcbi ctcbi){
		int result=ctcbiService.updateCtcbi(ctcbi);
		List<Ctcbi> ctcbis=ctcbiService.getAllCtcbi();
		map.put("ctcbis", ctcbis);
		return "ctcbi/ctcbi";
	}
}
