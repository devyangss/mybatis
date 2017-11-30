package org.yangss.dao;

import java.util.List;

import org.yangss.pojo.Student;

public interface StudentDao {

	public int add(Student student);
	public boolean update(Student student);
	public boolean deleteById(int id);
	public Student findById(int id);
	public List<Student> findAll();
}
