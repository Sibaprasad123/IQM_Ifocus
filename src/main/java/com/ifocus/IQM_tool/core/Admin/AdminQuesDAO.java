/**
 * 
 */
package com.ifocus.IQM_tool.core.Admin;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ifocus.IQM_tool.core.BusinessProcess.BusinessProcess;
import com.ifocus.IQM_tool.core.Admin.AdminQuestionnaire;
import java.util.List;

/**
 * @author IGS-Admin
 *
 */
public interface AdminQuesDAO extends MongoRepository<AdminQuestionnaire, String> {

	List<AdminQuestionnaire> findByBusinessProcess(BusinessProcess businessprocess);

}
