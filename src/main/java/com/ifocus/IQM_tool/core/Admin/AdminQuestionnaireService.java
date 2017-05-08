/**
 * 
 */
package com.ifocus.IQM_tool.core.Admin;

import java.util.List;

import com.ifocus.IQM_tool.core.Questionnaire.QuesCreateReqObject;


/**
 * @author IGS-Admin
 *
 */
public interface AdminQuestionnaireService {

	List<AdminQuestionnaire> getAllQuestionnaires();

	AdminQuestionnaire addAdminQues(String processid, QuesCreateReqObject quesCreateReqObject);

}
