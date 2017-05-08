/**
 * 
 */
package com.ifocus.IQM_tool.core.Questionnaire;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifocus.IQM_tool.core.BusinessProcess.BusinessProcess;
import com.ifocus.IQM_tool.core.BusinessProcess.BusinessProcessDAO;
import com.ifocus.IQM_tool.core.User.Choices;
import com.ifocus.IQM_tool.core.Weightage.Weightage;
import com.ifocus.IQM_tool.core.Weightage.WeightageDAO;

/**
 * @author IGS-Admin
 *
 */

@Service
public class RequesterQuestionnaireServiceImpl implements RequesterQuestionnaireService {

	@Autowired
	private ReqQuesDAO reqQuesDAO;

	@Autowired
	private BusinessProcessDAO businessProcessDAO;

	@Autowired
	private WeightageDAO weightageDAO;

	@Override
	public List<RequesterQuestionnaire> getAllQuestionnaires(String processId) {

		List<RequesterQuestionnaire> quesList = reqQuesDAO.findByBusinessProcessId(processId);

		return quesList;
	}

	@Override
	public RequesterQuestionnaire reqAssesment(String processid, ReqQuesObject reqQuesObject) {

		RequesterQuestionnaire requesterQuestionnaire = new RequesterQuestionnaire();

		BusinessProcess businessProcess = businessProcessDAO.findOne(processid);

		requesterQuestionnaire.setBusinessProcess(businessProcess);

		requesterQuestionnaire.setQuestionId(reqQuesObject.getQuestionId());
		requesterQuestionnaire.setQuestion(reqQuesObject.getQuestion());

		List<String> weightages = new ArrayList<>();
		weightages.addAll(reqQuesObject.getWeightage());

		Set<Weightage> wieghtageList = new HashSet<>();

		for (String weightageId : weightages) {

			wieghtageList.add(weightageDAO.findOne(weightageId));
		}

		requesterQuestionnaire.setWeightage(wieghtageList);

		requesterQuestionnaire.setChoices(Choices.valueOf(reqQuesObject.getChoice()));
		requesterQuestionnaire.setRemarks(reqQuesObject.getRemarks());

		requesterQuestionnaire = reqQuesDAO.save(requesterQuestionnaire);

		return requesterQuestionnaire;

	}

}
