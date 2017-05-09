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

	User updateUser(String userid, UserUpdateReqObject userUpdateReqObject) throws Exception;

	User getUserById(String userid) throws Exception;

	User deleteUser(String userid) throws Exception;

}
