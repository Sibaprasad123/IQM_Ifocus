/**
 * 
 */
package com.ifocus.IQM_tool.core.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public User createUser(@RequestBody User user) {

		 user = userService.createUser(user);

		return user;
	}

}
