/**
 * 
 */
package com.ifocus.IQM_tool.core.AuditRequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private AuditService auditService;

	@RequestMapping("/audits")
	public List<AuditRequest> getAllAudits() {

		List<AuditRequest> auditList = auditService.getAllAudits();

		return auditList;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/audits")
	public AuditRequest createUser(@RequestBody AuditRequest audit) {

		audit = auditService.createAudit(audit);

		return audit;
	}
}
