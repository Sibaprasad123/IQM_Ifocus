package com.ifocus.IQM_tool.core.User;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDAO userDAO;

	@Override
	public List<User> getAllUsers() {

		List<User> userList = new ArrayList<User>();

		userList = userDAO.findAll();

		return userList;
	}

	@Override
	public User getUserById(String userid) throws Exception {

		User user = null;
		if (!StringUtils.isEmpty(userid)) {
			user = userDAO.findOne(userid);
			if (user != null) {
				logger.info("Found user object");
				return user;
			} else {
				throw new Exception("Error occured trying to found");
			}

		} else {
			throw new Exception("user ID cannot be null");
		}
	}

	@Override
	public User createUser(User user) {

		user = userDAO.save(user);
		return user;
	}

	@Override
	public User updateUser(String userId, UserUpdateReqObject userUpdateReqObject) throws Exception {

		User user = null;

		if (!StringUtils.isEmpty(userId)) {
			user = userDAO.findOne(userId);
			if (user != null) {
				if (!StringUtils.isEmpty(userUpdateReqObject.getFirstName())) {
					user.setFirstName(userUpdateReqObject.getFirstName());
					// Setting the full name of the user after changing the
					// firstname
					user.setFullName(userUpdateReqObject.getFirstName() + " " + user.getLastName());
				}
				if (!StringUtils.isEmpty(userUpdateReqObject.getLastName())) {
					user.setLastName(userUpdateReqObject.getLastName());
					// Setting the full name of the user after changing the
					// lastname
					user.setFullName(userUpdateReqObject.getFirstName() + " " + user.getLastName());
				}
				if (!StringUtils.isEmpty(userUpdateReqObject.getRating())) {
					user.setRating(userUpdateReqObject.getRating());
				}
				if (!StringUtils.isEmpty(userUpdateReqObject.getAbout())) {
					user.setAbout(userUpdateReqObject.getAbout());
				}
				if (!StringUtils.isEmpty(userUpdateReqObject.getOrganizationName())) {
					user.setOrganizationName(userUpdateReqObject.getOrganizationName());
				}
				if (!StringUtils.isEmpty(userUpdateReqObject.getOrganizationStrength())) {
					user.setOrganizationStrength(userUpdateReqObject.getOrganizationStrength());
				}
				user = userDAO.save(user);
			} else {
				throw new Exception("User doesn't exist");
			}
		} else {
			throw new Exception("User Id cannot empty");
		}

		return user;
	}

	@Override
	public User deleteUser(String userid) throws Exception {

		User user = null;
		if (!StringUtils.isEmpty(userid)) {
			user = userDAO.findOne(userid);
			if (user != null) {
				logger.info("Deleting user object");
				userDAO.delete(user);
			} else {
				throw new Exception("User doesn't exist");
			}
		} else {
			throw new Exception("UserID cannot be null");
		}
		return user;
	}

}
