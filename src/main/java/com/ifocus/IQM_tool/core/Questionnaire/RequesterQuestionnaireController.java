/**
 * 
 */
package com.ifocus.IQM_tool.core.Questionnaire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IGS-Admin
 *
 */
@RestController
public class RequesterQuestionnaireController {

	@Autowired
	private RequesterQuestionnaireService requesterQuestionnaireService;

	/**
	 * Method to get all the questionnaires related to particular
	 * businessProcess
	 * 
	 * @param processId
	 * @return
	 */
	@RequestMapping("/businessprocesses/{processId}/reqr_ques")
	private List<RequesterQuestionnaire> getAllQuestionnaires(@PathVariable String processId) {

		List<RequesterQuestionnaire> questionnaireList = requesterQuestionnaireService.getAllQuestionnaires(processId);

		return questionnaireList;

	}

	/**
	 * Method to create questionnaire of the requester
	 * 
	 * Here we will be creating questionnaire which will be generated based on
	 * the user's selection of choices and other parameters
	 * 
	 * @param reqQuesObject
	 * @param processId
	 * @return
	 */

	@RequestMapping(method = RequestMethod.POST, value = "businessprocesses/{processId}/reqr_ques")
	public RequesterQuestionnaire reqAssesment(@RequestBody ReqQuesCreateObject reqQuesObject,
			@PathVariable String processId) {

		RequesterQuestionnaire requesyerQuestionnaire = requesterQuestionnaireService.reqAssesment(processId,
				reqQuesObject);

		return requesyerQuestionnaire;
	}

}
