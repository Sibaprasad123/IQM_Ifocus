/**
 * 
 */
package com.ifocus.IQM_tool.core.AuditRequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * @author IGS-Admin
 *
 */
@Service
public class AuditServiceImpl implements AuditService {

	@Autowired
	private AuditRequestDAO auditRequestDAO;

	@Override
	public List<AuditRequest> getAllAudits() {

		List<AuditRequest> auditList = auditRequestDAO.findAll();

		return auditList;
	}

	@Override
	public AuditRequest createAudit(AuditRequest audit) {

		audit = auditRequestDAO.save(audit);
		return audit;
	}

}
