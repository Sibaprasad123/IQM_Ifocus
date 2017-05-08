/**
 * 
 */
package com.ifocus.IQM_tool.core.User;

import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * @author IGS-Admin
 *
 */
public interface UserDAO extends MongoRepository<User, String> {

}
