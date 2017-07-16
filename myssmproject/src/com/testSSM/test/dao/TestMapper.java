package com.testSSM.test.dao;

import com.testSSM.test.model.Group;
import com.testSSM.test.model.User;

public interface TestMapper {
	public User queryTest(int userId);
	public void insertUser(User user);
	public void insertGroup(Group group);
	public void updateUser(User user);
	public void deleteUser(User user);
}
