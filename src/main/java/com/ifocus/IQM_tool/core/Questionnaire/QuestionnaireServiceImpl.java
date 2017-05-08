/**
 * 
 */
package com.ifocus.IQM_tool.core.Questionnaire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifocus.IQM_tool.core.Admin.AdminQuestionnaire;



/**
 * @author IGS-Admin
 *
 */
@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

	@Autowired
	private QuestionnaireDAO questionnaireDAO;

	/**
	 * Method to retrieve all available questionnaires
	 */
	@Override
	public List<AdminQuestionnaire> getAllQuestionnaire() {

		List<AdminQuestionnaire> quesList = questionnaireDAO.findAll();

		return quesList;
	}

	/**
	 * Method to create new questionnaire
	 */
	@Override
	public void createQuestionnaire(AdminQuestionnaire questionnaire) {
		// TODO Auto-generated method stub

	}

}
