/**
 * 
 */
package com.ifocus.IQM_tool.core.AuditRequest;

import java.util.List;

/**
 * @author IGS-Admin
 *
 */
public interface AuditService {

	List<AuditRequest> getAllAudits();

	double calculateAuditScore(String auditid, WeightageCalculation weightageCalculation);

	AuditRequest getAuditById(String auditid) throws Exception;

	AuditRequest createAudit(AuditReqCreateObject auditReqCreateObject, String processid) throws Exception;
}
