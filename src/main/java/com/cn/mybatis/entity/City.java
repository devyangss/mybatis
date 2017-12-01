package com.cn.mybatis.entity;

import java.util.Date;
import java.util.List;

public class City {
	private int id;
	private int status;
	private int province_id;
	private String code;
	private String name;
	private Date createTime;
	private Date updateTime;
	
	private List<Area> areas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getProvince_id() {
		return province_id;
	}
	public void setProvince_id(int province_id) {
		this.province_id = province_id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", status=" + status + ", province_id=" + province_id + ", code=" + code + ", name="
				+ name + ", createTime=" + createTime + ", updateTime=" + updateTime + ", areas=" + areas.toString() + "]";
	}
	
	
}
