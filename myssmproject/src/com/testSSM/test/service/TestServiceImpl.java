package com.testSSM.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sun.rmi.runtime.Log;
import sun.util.LocaleServiceProviderPool.LocalizedObjectGetter;

import com.testSSM.test.dao.TestMapper;
import com.testSSM.test.model.Group;
import com.testSSM.test.model.User;

@Service("testService")
public class TestServiceImpl implements TestService{

	@Resource
	private TestMapper testMapper;
//	
//	public TestMapper getTestMapper() {
//		return testMapper;
//	}
//
//	public void setTestMapper(TestMapper testMapper) {
//		this.testMapper = testMapper;
//	}

	public  User queryTest(int userId) throws Exception {
		try {
			System.out.println(userId);
			System.out.println(testMapper);
			return testMapper.queryTest(userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
//		return null;
	}

	public void insertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.err.println("±£´æ");
			testMapper.insertUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println("ÐÞ¸Ä");
			System.out.println(user.getId());
			testMapper.updateUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteUser(User user) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println("É¾³ý");
			System.out.println(user.getId());
			testMapper.deleteUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertGroup(Group group) throws Exception {
		// TODO Auto-generated method stub
		testMapper.insertGroup(group);
	}

	public void save(User user) throws Exception {
		// TODO Auto-generated method stub
		testMapper.insertUser(user);
		Group roup=new Group();
		roup.setAge(user.getId());
		roup.setId(user.getAge());
		testMapper.insertGroup(roup);
		
	}
	

}
