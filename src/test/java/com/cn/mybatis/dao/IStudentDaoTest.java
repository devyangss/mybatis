package com.cn.mybatis.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cn.mybatis.entity.Student;

public class IStudentDaoTest {
	
	final Logger logger = LoggerFactory.getLogger(IStudentDaoTest.class);
	
	@Test
	public void testInsert() throws IOException {
		Date date = new Date();
		
		String resource = "mybatis2.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建sqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建session对象
		SqlSession session = sqlSessionFactory.openSession();
		
		Student student = new Student();
		student.setName("林拜");
		student.setAge(35);
		student.setGender(1);
		student.setIdcard("110101200309049595");
		student.setCreateTime(date);
		student.setUpdateTime(date);
		
		session.insert("insert", student);
		session.commit();
		System.out.println("添加成功, id=" + student.getId());
		// 关闭session
		session.close();
	}
	
	@Test
	public void testUpdate() throws IOException {
		Date date = new Date();
		
		String resource = "mybatis2.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建sqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建session对象
		SqlSession session = sqlSessionFactory.openSession();
		
		Student student = (Student) session.selectOne("findById", 1005);
		if (student == null) {
			System.out.println("查询不到数据");
			logger.debug("查询不到数据");
			return;
		}
		student.setUpdateTime(date);
		
		int ret = session.update("update", student);
		System.out.println("session.update return value = " + ret);
		session.commit();
		System.out.println("更新成功, id=" + student.getId());
		// 关闭session
		session.close();
	}
	
	@Test
	public void testDeleteById() throws IOException {
		String resource = "mybatis2.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建sqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建session对象
		SqlSession session = sqlSessionFactory.openSession();
		
		int id = 1006;
		int ret = session.delete("deleteById", id);
		System.out.println("session.delete return value = " + ret);
		session.commit();
		if (ret == 1) {
			System.out.println("删除成功, id=" + id);
		} else {
			System.out.println("删除失败, id=" + id);
		}
		// 关闭session
		session.close();
	}
	
	@Test
	public void testFindById() throws IOException {
		String resource = "mybatis2.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建sqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建session对象
		SqlSession session = sqlSessionFactory.openSession();
		
		int id = 1001;
		Student student = (Student) session.selectOne("findById", id);
		System.out.println(student.toString());
		
		session.commit();
		
		// 关闭session
		session.close();
	}
	
	@Test
	public void testFindAll() throws IOException {
		String resource = "mybatis2.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建sqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建session对象
		SqlSession session = sqlSessionFactory.openSession();
		
		int id = 1001;
		List<Student> list = session.selectList("findAll", id);
		if (!list.isEmpty()) {
			for (Student student : list) {
				System.out.println(student.toString());
			}
		}
		
		session.commit();
		
		// 关闭session
		session.close();
	}

}
