package com.zhou.dao;

import java.util.List;

import com.zhou.bean.Ctcbi;

public interface CtcbiDao {
	
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
