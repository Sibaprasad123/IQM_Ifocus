/**
 * 
 */
package com.ifocus.IQM_tool.core.Questionnaire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifocus.IQM_tool.core.Admin.AdminQuestionnaire;



/**
 * @author IGS-Admin
 *
 */
@RestController
public class QuestionnaireController {

	@Autowired
	private QuestionnaireService questionnaireService;

	@RequestMapping("/questionnaires")
	public List<AdminQuestionnaire> getAllQuestionnaires() {

		List<AdminQuestionnaire> questionnaireList = questionnaireService.getAllQuestionnaire();

		return questionnaireList;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/businessprocess/{processid}/questionnaires")
	public AdminQuestionnaire createNewQuestionnaire(@RequestBody AdminQuestionnaire questionnaire) {

		questionnaireService.createQuestionnaire(questionnaire);

		return null;
	}
}
