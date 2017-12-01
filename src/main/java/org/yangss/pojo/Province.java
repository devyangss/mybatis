package org.yangss.pojo;

import java.util.Date;
import java.util.List;

public class Province {
	private int id;
	private int status;
	private int type;
	private String code;
	private String name;
	private Date createTime;
	private Date updateTime;
	
	private List<City> citys;
	
	
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
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
	
	
	public List<City> getCitys() {
		return citys;
	}
	public void setCitys(List<City> citys) {
		this.citys = citys;
	}
	@Override
	public String toString() {
		return "Province [id=" + id + ", status=" + status + ", type=" + type + ", code=" + code + ", name=" + name
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", citys=" + citys.toString() + "]";
	}
	
	
}
