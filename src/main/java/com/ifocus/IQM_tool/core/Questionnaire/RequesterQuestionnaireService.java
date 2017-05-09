/**
 * 
 */
package com.ifocus.IQM_tool.core.Questionnaire;

import java.util.List;

/**
 * @author IGS-Admin
 *
 */
public interface RequesterQuestionnaireService {

	List<RequesterQuestionnaire> getAllQuestionnaires(String processId);

	RequesterQuestionnaire reqAssesment(String processid, ReqQuesCreateObject reqQuesObject);

}
