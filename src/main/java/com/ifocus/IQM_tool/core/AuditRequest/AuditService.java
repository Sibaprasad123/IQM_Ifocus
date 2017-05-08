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

	AuditRequest createAudit(AuditRequest audit);
}
