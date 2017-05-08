/**
 * 
 */
package com.ifocus.IQM_tool.core.BusinessProcess;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;



/**
 * @author IGS-Admin
 *
 */
public interface BusinessProcessDAO extends MongoRepository<BusinessProcess, String> {

	List<BusinessProcess> findByBusinessAreaId(String id);

}
