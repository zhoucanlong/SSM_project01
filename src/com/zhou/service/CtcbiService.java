package com.zhou.service;

import java.util.List;

import com.zhou.bean.Ctcbi;

public interface CtcbiService {
	
	//获取部分ctcbi信息
	public List<Ctcbi> getCtcbiByNum(Ctcbi ctcbi);
	
	//获取全部ctcbi信息
	public List<Ctcbi> getAllCtcbi();
	
	//增加ctcbi信息
	public int addCtcbi(Ctcbi ctcbi);
	
	//删除ctcbi信息
	public int deleteCtcbi(Ctcbi ctcbi);
	
	//修改ctcbi信息
	public int updateCtcbi(Ctcbi ctcbi);
}
