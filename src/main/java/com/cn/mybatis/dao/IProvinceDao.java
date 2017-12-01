package com.cn.mybatis.dao;

import java.util.List;

import com.cn.mybatis.entity.Province;

public interface IProvinceDao {

	public List<Province> findAllArea(int id);
}
