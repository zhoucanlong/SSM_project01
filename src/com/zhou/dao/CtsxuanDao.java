package com.zhou.dao;

import java.util.List;

import com.zhou.bean.Ctsxuan;

public interface CtsxuanDao {
	
	//获取所有的cts信息
	public List<Ctsxuan> getAllCtsxuan();
	
	//获取部分cts信息
	public List<Ctsxuan> getCtsxuanByNum(Ctsxuan ctsxuan);
	
	//增加cts信息
	public int addCtsxuan(Ctsxuan ctsxuan);
	
	//删除cts信息
	public int deleteCtsxuan(Ctsxuan ctsxuan);
	
	//修改cts信息
	public int updateCtsxuan(Ctsxuan ctsxuan);
}
