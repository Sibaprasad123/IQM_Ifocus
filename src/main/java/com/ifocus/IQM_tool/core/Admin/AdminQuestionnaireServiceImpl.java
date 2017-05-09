/**
 * 
 */
package com.ifocus.IQM_tool.core.Admin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifocus.IQM_tool.core.BusinessProcess.BusinessProcess;
import com.ifocus.IQM_tool.core.BusinessProcess.BusinessProcessDAO;
import com.ifocus.IQM_tool.core.Questionnaire.AdminQuesCreateObject;
import com.ifocus.IQM_tool.core.User.Choices;
import com.ifocus.IQM_tool.core.Weightage.Weightage;
import com.ifocus.IQM_tool.core.Weightage.WeightageDAO;



/**
 * @author IGS-Admin
 *
 */
@Service
public class AdminQuestionnaireServiceImpl implements AdminQuestionnaireService {

	@Autowired
	private AdminQuesDAO adminQuesDAO;

	@Autowired
	private BusinessProcessDAO businessProcessDAO;

	@Autowired
	private WeightageDAO weightageDAO;

	@Override
	public List<AdminQuestionnaire> getAllQuestionnaires() {

		List<AdminQuestionnaire> AdminQuesList = adminQuesDAO.findAll();

		return AdminQuesList;
	}

	@Override
	public AdminQuestionnaire addAdminQues(String processId, AdminQuesCreateObject quesCreateReqObject) {

		AdminQuestionnaire adminQuestionnaire = new AdminQuestionnaire();

		BusinessProcess businessProcess = businessProcessDAO.findOne(processId);

		adminQuestionnaire.setBusinessProcess(businessProcess);

		adminQuestionnaire.setQuestionId(quesCreateReqObject.getQuestionId());
		adminQuestionnaire.setQuestion(quesCreateReqObject.getQuestion());

		List<String> weightages = new ArrayList<>();
		weightages.addAll(quesCreateReqObject.getWeightage());

		Set<Weightage> wieghtageList = new HashSet<>();

		for (String weightageId : weightages) {

			wieghtageList.add(weightageDAO.findOne(weightageId));
		}

		adminQuestionnaire.setWeightage(wieghtageList);

		List<String> choices = new ArrayList<>();
		choices.addAll(quesCreateReqObject.getChoices());

		Set<Choices> choiceSet = new HashSet<>();

		for (String choice : choices) {

			choiceSet.add(Choices.valueOf(choice));
		}

		adminQuestionnaire.setChoices(choiceSet);

		adminQuestionnaire = adminQuesDAO.save(adminQuestionnaire);

		return adminQuestionnaire;
	}

}
