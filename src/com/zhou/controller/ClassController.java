package com.zhou.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.bean.ClassTable;
import com.zhou.service.ClassService;

@RequestMapping("/class")
@Controller
public class ClassController {
	
	@Autowired
	ClassService classService;
	
	//��ѯ���а༶��Ϣ
	@RequestMapping("/getallclass")
	public String getAllClass(Map<String,Object> map){
		List<ClassTable> classTables=classService.getAllClass();
		map.put("classTables",classTables);
		System.out.println(classTables);
		return "class/class";
	}
	
	//��ѯ���������İ༶��Ϣ
	@RequestMapping("/getclass")
	public String getClassByNumOrYear(Map<String,Object> map,ClassTable classTable){
		List<ClassTable> classTables=classService.getClassByClassNumOrYear(classTable);
		map.put("classTables", classTables);
		return "class/class";
	}
	
	//��Ӱ༶��Ϣ
	@RequestMapping("/addclass")
	public String addClass(Map<String,Object> map,ClassTable classTable){
		int result=classService.addClass(classTable);
		List<ClassTable> classTables=classService.getAllClass();
		map.put("classTables", classTables);
		return "class/class";
	}
	
	//ת�����޸�ҳ��
	@RequestMapping("/dispatchupdate")
	public String dispatchUpdate(Map<String,Object> map,ClassTable classTable){
		System.out.println("dispatch:"+classTable);
		List<ClassTable> classTables=classService.getClassByClassNumOrYear(classTable);
		ClassTable classTable2=classTables.get(0);
		//���༶��Ϣ�洢��map��
		map.put("classTable", classTable2);
		return "class/update";
	}
	
	//�޸İ༶��Ϣ
	@RequestMapping("/updateclass")
	public String updateClass(Map<String,Object> map,ClassTable classTable){
		int result=classService.updateClass(classTable);
		List<ClassTable> classTables=classService.getAllClass();
		map.put("classTables", classTables);
		return "class/class";
	}
	
	//ɾ���༶��Ϣ
	@RequestMapping("/deleteclass")
	public String deleteClass(Map<String,Object> map,ClassTable classTable){
		int result=classService.deleteClass(classTable);
		List<ClassTable> classTables=classService.getAllClass();
		map.put("classTables", classTables);
		return "class/class";
	}
}
