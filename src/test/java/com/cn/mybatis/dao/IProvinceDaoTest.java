package com.cn.mybatis.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cn.mybatis.entity.Province;
import com.google.gson.Gson;

public class IProvinceDaoTest {
	
	final Logger logger = LoggerFactory.getLogger(IProvinceDaoTest.class);
	
	@Test
	public void testFindAllArea() throws IOException {
		String resource = "mybatis2.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建sqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建session对象
		SqlSession session = sqlSessionFactory.openSession();
		
		int id = 14;
		List<Province> list = session.selectList("findAllArea", id);
		
		if (!list.isEmpty()) {
			System.out.println(new Gson().toJson(list));
		}
		
		session.commit();
		
		// 关闭session
		session.close();
	}

}
