/**
 * 
 */
package com.ifocus.IQM_tool.core.Questionnaire;

import java.util.List;

import com.ifocus.IQM_tool.core.Admin.AdminQuestionnaire;



/**
 * @author IGS-Admin
 *
 */
public interface QuestionnaireService {

	List<AdminQuestionnaire> getAllQuestionnaire();

	void createQuestionnaire(AdminQuestionnaire questionnaire);

}
