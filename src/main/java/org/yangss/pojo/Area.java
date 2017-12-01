package org.yangss.pojo;

import java.util.Date;

import sun.net.www.content.text.plain;

public class Area {
	private int id;
	private int status;
	private int city_id;
	private String code;
	private String name;
	private Date createTime;
	private Date updateTime;
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
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
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
	@Override
	public String toString() {
		return "Area [id=" + id + ", status=" + status + ", city_id=" + city_id + ", code=" + code + ", name=" + name
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
}
