/**
 * 
 */
package com.ifocus.IQM_tool.core.BusinessProcess;

import java.util.List;

/**
 * @author IGS-Admin
 *
 */
public interface BusinessProcessService {

	List<BusinessProcess> getAllBusinessProcesses(String id);

	BusinessProcess getBusinessProcess(String id);

	BusinessProcess addBusinessProcess(String businessAreaId, BusinessProcess businessProcess);

	BusinessProcess updateProcessStatus(String processid, String status) throws Exception;

	String deleteProcessStatus(String processid) throws Exception;

}
