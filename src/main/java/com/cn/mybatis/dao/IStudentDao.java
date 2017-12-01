package com.cn.mybatis.dao;

import java.util.List;

import com.cn.mybatis.entity.Student;

public interface IStudentDao {

	public int add(Student student);
	public boolean update(Student student);
	public boolean deleteById(int id);
	public Student findById(int id);
	public List<Student> findAll();
}
