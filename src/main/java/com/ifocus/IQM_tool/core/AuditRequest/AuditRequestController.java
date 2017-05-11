/**
 * 
 */
package com.ifocus.IQM_tool.core.AuditRequest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
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
public class AuditRequestController {

	private static final Logger logger = LoggerFactory.getLogger(AuditRequestController.class);

	@Autowired
	private AuditService auditService;

	/**
	 * Method for retrieving all the existing audit requests
	 * 
	 * @return
	 */
	@RequestMapping("/audits")
	public List<AuditRequest> getAllAudits() {

		logger.info("Retriving all existing audits");
		List<AuditRequest> auditList = auditService.getAllAudits();

		return auditList;
	}

	/**
	 * Method to retrieve particular auditRequest object by ID
	 * 
	 * @param auditid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/audits/{auditid}")
	public AuditRequest getAuditById(@PathVariable String auditid) throws Exception {

		AuditRequest audit = null;
		if (!StringUtils.isEmpty(auditid)) {
			logger.info("Retriving all existing audits");
			audit = auditService.getAuditById(auditid);
		} else {
			throw new Exception("Error finding requested audit report");
		}
		return audit;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/businessprocesses/{processid}/audits")
	public AuditRequest createAuditRequest(@RequestBody AuditReqCreateObject auditReqCreateObject,
			@PathVariable String processid) throws Exception {

		AuditRequest auditRequest = null;
		if (auditReqCreateObject != null) {
			logger.info("Creating AuditRequest object...");
			auditRequest = auditService.createAudit(auditReqCreateObject, processid);
			if (auditRequest != null) {
				return auditRequest;
			} else {
				throw new Exception("Error creating AuditRequest");
			}
		} else {
			throw new Exception("Request object cannot be null");
		}

	}

	/**
	 * Method to calculate score for the audit
	 * 
	 * @param weightageCalculation
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/audits/{auditid}/auditscore")
	public double calculateAuditScore(@RequestBody WeightageCalculatorPOJO weightageCalculation,
			@PathVariable String auditid) {

		double score = 0;
		if (!StringUtils.isEmpty(auditid)) {

			logger.info("Calculating audit score");
			score = auditService.calculateAuditScore(auditid, weightageCalculation);
		}
		return score;

	}

}
