/**
 * 
 */
package com.ifocus.IQM_tool.core.Questionnaire;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ifocus.IQM_tool.core.Admin.AdminQuestionnaire;



/**
 * @author IGS-Admin
 *
 */
public interface QuestionnaireDAO extends MongoRepository<AdminQuestionnaire, String> {

}
