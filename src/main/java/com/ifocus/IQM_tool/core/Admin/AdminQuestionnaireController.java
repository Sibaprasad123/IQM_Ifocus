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

import com.ifocus.IQM_tool.core.Questionnaire.AdminQuesCreateObject;

/**
 * @author IGS-Admin
 * 
 *         Controller for ADMIN questionnaire set
 */
@RestController
public class AdminQuestionnaireController {

	@Autowired
	private AdminQuestionnaireService adminQuestionnaireService;

	/**
	 * Method to get all the available questionnaires
	 * 
	 * Basically the admin questionnaires
	 * 
	 * @return
	 */

	@RequestMapping("/admin_ques")
	private List<AdminQuestionnaire> getAllQuestionnaires() {

		List<AdminQuestionnaire> questionnaireList = adminQuestionnaireService.getAllQuestionnaires();

		return questionnaireList;

	}

	/**
	 * Method to create new questionnaire
	 * 
	 * Here, basically new questionnaire would be framed with all the available
	 * choices, stages for particular questionnaire
	 * 
	 * @param quesCreateReqObject
	 * @param processid
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "businessprocesses/{processid}/admin_ques")
	public AdminQuestionnaire createAdminQues(@RequestBody AdminQuesCreateObject quesCreateReqObject,
			@PathVariable String processid) {

		AdminQuestionnaire adminQuestionnaire = adminQuestionnaireService.addAdminQues(processid, quesCreateReqObject);

		return adminQuestionnaire;
	}

	/**
	 * Method to get all ADMIN questionnaires based on the businessProcess
	 * 
	 * One need to pass the businessProcessId in order to get relevant
	 * questionnaire
	 * 
	 * These questionnaire are nothing but the original questionnaire framed by
	 * the ADMIN
	 * 
	 * @param processid
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(method = RequestMethod.GET, value = "businessprocesses/{processid}/admin_ques")
	public List<AdminQuestionnaire> getAdminQuestionnaires(@PathVariable String processid) throws Exception {

		List<AdminQuestionnaire> adminQuestionnaireList = adminQuestionnaireService.getAllAdminQues(processid);

		return adminQuestionnaireList;
	}

}
