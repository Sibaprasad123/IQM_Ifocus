/**
 * 
 */
package com.ifocus.IQM_tool.core.AuditRequest;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author IGS-Admin
 *
 */
public interface AuditRequestDAO extends MongoRepository<AuditRequest, String> {

}
