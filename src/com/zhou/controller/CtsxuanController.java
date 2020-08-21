package com.zhou.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.Ctsxuan;
import com.zhou.service.CtsxuanService;

@RequestMapping("/ctsxuan")
@Controller
public class CtsxuanController {
	
	@Autowired
	CtsxuanService ctsxuanService;
	
	@RequestMapping("/getallctsxuan")
	public String getAllCtsxuan(Map<String,Object> map){
		System.out.println("getallctsxuan");
		List<Ctsxuan> ctsxuans=ctsxuanService.getAllCtsxuan();
		map.put("ctsxuans", ctsxuans);
		return "ctsxuan/ctsxuan";
	}
	
	@RequestMapping("/getctsxuanbynum")
	public String getCtsxuanByNum(Map<String,Object> map,Ctsxuan ctsxuan){
		List<Ctsxuan> ctsxuans=ctsxuanService.getCtsxuanByNum(ctsxuan);
		System.out.println("ctsxuan:"+ctsxuan);
		map.put("ctsxuans", ctsxuans);
		return "ctsxuan/ctsxuan";
	}
	
	@RequestMapping("/addctsxuan")
	public String addCtsxuan(Map<String,Object> map,Ctsxuan ctsxuan){
		int result=ctsxuanService.addCtsxuan(ctsxuan);
		List<Ctsxuan> ctsxuans=ctsxuanService.getAllCtsxuan();
		map.put("ctsxuans", ctsxuans);
		return "ctsxuan/ctsxuan";
	}
	
	@RequestMapping("/deletectsxuan")
	public String deleteCtsxuan(Map<String,Object> map,Ctsxuan ctsxuan){
		int result=ctsxuanService.deleteCtsxuan(ctsxuan);
		List<Ctsxuan> ctsxuans=ctsxuanService.getAllCtsxuan();
		map.put("ctsxuans", ctsxuans);
		return "ctsxuan/ctsxuan";
	}
	
	@RequestMapping("/dispatchupdate")
	public String dispatchUpdate(Map<String,Object> map,Ctsxuan ctsxuan){
		List<Ctsxuan> ctsxuans=ctsxuanService.getCtsxuanByNum(ctsxuan);
		Ctsxuan getCtsxuan=ctsxuans.get(0);
		map.put("ctsxuan", getCtsxuan);
		return "ctsxuan/update";
	}
	
	@RequestMapping("/updatectsxuan")
	public String updateCtsxuan(Map<String,Object> map,Ctsxuan ctsxuan){
		System.out.println("update:"+ctsxuan);
		int result=ctsxuanService.updateCtsxuan(ctsxuan);
		List<Ctsxuan> ctsxuans=ctsxuanService.getAllCtsxuan();
		map.put("ctsxuans", ctsxuans);
		return "ctsxuan/ctsxuan";
	}
	
}
