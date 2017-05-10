/**
 * 
 */
package com.ifocus.IQM_tool.core.AuditRequest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.ifocus.IQM_tool.core.BusinessProcess.BusinessProcess;
import com.ifocus.IQM_tool.core.BusinessProcess.BusinessProcessDAO;
import com.ifocus.IQM_tool.core.Questionnaire.ReqQuesDAO;
import com.ifocus.IQM_tool.core.Questionnaire.RequesterQuestionnaire;

/**
 * @author IGS-Admin
 *
 */
@Service
public class AuditServiceImpl implements AuditService {

	private static final Logger logger = LoggerFactory.getLogger(AuditServiceImpl.class);

	@Autowired
	private AuditRequestDAO auditRequestDAO;

	@Autowired
	private BusinessProcessDAO businessProcessDAO;

	@Autowired
	private ReqQuesDAO reqQuesDAO;

	/**
	 * Method to get all available audits
	 */
	@Override
	public List<AuditRequest> getAllAudits() {

		List<AuditRequest> auditList = auditRequestDAO.findAll();

		return auditList;
	}

	/**
	 * Method to get particular audit request
	 */
	@Override
	public AuditRequest getAuditById(String auditid) throws Exception {

		AuditRequest auditRequest = null;
		if (!StringUtils.isEmpty(auditid)) {
			auditRequest = auditRequestDAO.findOne(auditid);
			if (auditRequest != null) {
				logger.info("Auditrequest found successfully");
			} else {
				throw new Exception("Requested audit couldn't be found");
			}
		} else {
			throw new Exception("Audit ID cannot be null");
		}
		return auditRequest;
	}

	/**
	 * Method to create new AuditRequest
	 */
	@Override
	public AuditRequest createAudit(AuditReqCreateObject auditReqCreateObject, String processid) throws Exception {

		AuditRequest auditRequest = new AuditRequest();
		List<RequesterQuestionnaire> questionnaireSet = new ArrayList<>();

		if (!StringUtils.isEmpty(processid)) {
			BusinessProcess businessProcess = businessProcessDAO.findOne(processid);
			if (businessProcess != null) {
				if (auditReqCreateObject.getQuestionnaires().size() != 0) {
					for (String questId : auditReqCreateObject.getQuestionnaires()) {
						RequesterQuestionnaire reqQuestionnaire = reqQuesDAO.findOne(questId);
						if (reqQuestionnaire != null) {
							questionnaireSet.add(reqQuestionnaire);
						}
					}
				} else {
					throw new Exception("QuestionnaireIds cannot be empty");
				}
			} else {
				throw new Exception("BusinessProcess doesn't exist");
			}
		} else {
			throw new Exception("Process ID cannot be null");
		}
		auditRequest.setQuestionnaires(questionnaireSet);

		auditRequest = auditRequestDAO.save(auditRequest);
		/*
		 * setting other attributes of auditrequest should be done later
		 */

		return auditRequest;
	}

	@Override
	public double calculateAuditScore(String auditId, WeightageCalculatorPOJO weightageCalculation) {

		AuditRequest auditRequest = null;
		double score = 0;
		if (!StringUtils.isEmpty(auditId)) {
			auditRequest = auditRequestDAO.findOne(auditId);
			if (auditRequest != null) {

				double actualTotal = weightageCalculation.getActualTotal();
				double maxTotal = weightageCalculation.getMaxTotal();

				score = actualTotal / maxTotal;
			}
		}
		auditRequest.setAuditScore(score);
		auditRequestDAO.save(auditRequest);
		return score;
	}

}
