/**
 * 
 */
package com.ifocus.IQM_tool.core.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IGS-Admin
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/users")
	public List<User> getUsers() {

		List<User> userList = userService.getAllUsers();

		return userList;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/users/{userid}")
	public User getUserById(@PathVariable String userid) throws Exception {

		User user = null;
		if (!StringUtils.isEmpty(userid)) {
			user = userService.getUserById(userid);
		} else
			throw new Exception("User ID cannot be null");
		return user;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public User createUser(@RequestBody User user) {

		user = userService.createUser(user);

		return user;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/users/{userid}")
	public User updateUser(@RequestBody UserUpdateReqObject userUpdateReqObject, @PathVariable String userid)
			throws Exception {

		User user = null;
		if (!StringUtils.isEmpty(userid)) {
			user = userService.updateUser(userid, userUpdateReqObject);
			if (user != null) {
				return user;
			} else {
				throw new Exception("Error occured trying to update user infomation");
			}
		} else {
			throw new Exception("User ID cannot be null");
		}
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{userid}")
	public String deleteUser(@PathVariable String userid) throws Exception {

		User user = null;
		try {
			user = userService.deleteUser(userid);
		} catch (Exception e) {
			throw new Exception("Error occured trying to delete the user");
		}

		return "User deleted successfully " + user.getId();

	}

}
