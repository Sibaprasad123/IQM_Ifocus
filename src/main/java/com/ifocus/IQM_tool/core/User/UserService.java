/**
 * 
 */
package com.ifocus.IQM_tool.core.User;

import java.util.List;
/**
 * @author IGS-Admin
 *
 */
public interface UserService {

	List<User> getAllUsers();

	User createUser(User user);

}
