package com.ifocus.IQM_tool.core.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public List<User> getAllUsers() {

		List<User> userList = new ArrayList<User>();

		userList = userDAO.findAll();

		return userList;
	}

	@Override
	public User createUser(User user) {

		user = userDAO.save(user);
		return user;
	}

}
