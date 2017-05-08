/**
 * 
 */
package com.ifocus.IQM_tool.core.Admin;

import org.springframework.data.mongodb.repository.MongoRepository;



/**
 * @author IGS-Admin
 *
 */
public interface AdminQuesDAO extends MongoRepository<AdminQuestionnaire, String> {

}
