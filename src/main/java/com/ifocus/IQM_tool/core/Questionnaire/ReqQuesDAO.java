/**
 * 
 */
package com.ifocus.IQM_tool.core.Questionnaire;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author IGS-Admin
 *
 */
public interface ReqQuesDAO extends MongoRepository<RequesterQuestionnaire, String> {

	List<RequesterQuestionnaire> findByBusinessProcessId(String processId);
}
