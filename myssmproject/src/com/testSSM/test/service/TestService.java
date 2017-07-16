package com.testSSM.test.service;

import com.testSSM.test.model.Group;
import com.testSSM.test.model.User;

public interface TestService {
	public User queryTest(int userId)throws Exception;
	public void insertUser(User user)throws Exception;
	public void updateUser(User user)throws Exception;
	public void deleteUser(User user)throws Exception;
	public void insertGroup(Group group)throws Exception;
	public void save(User user)throws Exception;
}
