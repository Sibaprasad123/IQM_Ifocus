/**
 * 
 */
package com.ifocus.IQM_tool.core.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifocus.IQM_tool.core.Questionnaire.QuesCreateReqObject;



/**
 * @author IGS-Admin
 * 
 *         Controller for ADMIN questionnaire set
 */
@RestController
public class AdminQuestionnaireController {

	@Autowired
	private AdminQuestionnaireService adminQuestionnaireService;

	@RequestMapping("/admin_ques")
	private List<AdminQuestionnaire> getAllQuestionnaires() {

		List<AdminQuestionnaire> questionnaireList = adminQuestionnaireService.getAllQuestionnaires();

		return questionnaireList;

	}

	@RequestMapping(method = RequestMethod.POST, value = "businessprocess/{processid}/admin_ques")
	public AdminQuestionnaire createAdminQues(@RequestBody QuesCreateReqObject quesCreateReqObject,
			@PathVariable String processid) {

		AdminQuestionnaire adminQuestionnaire = adminQuestionnaireService.addAdminQues(processid, quesCreateReqObject);

		return adminQuestionnaire;
	}

}
