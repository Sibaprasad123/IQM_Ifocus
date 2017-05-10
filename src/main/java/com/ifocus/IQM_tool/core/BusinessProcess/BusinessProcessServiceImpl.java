/**
 * 
 */
package com.ifocus.IQM_tool.core.BusinessProcess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifocus.IQM_tool.core.BusinessArea.BusinessArea;
import com.ifocus.IQM_tool.core.BusinessArea.BusinessAreaDAO;

/**
 * @author IGS-Admin
 *
 */
@Service
public class BusinessProcessServiceImpl implements BusinessProcessService {

	@Autowired
	private BusinessProcessDAO businessProcessDAO;

	@Autowired
	private BusinessAreaDAO businessAreaDAO;

	@Override
	public List<BusinessProcess> getAllBusinessProcesses(String id) {

		List<BusinessProcess> businessProcesses = businessProcessDAO.findByBusinessAreaId(id);

		return businessProcesses;
	}

	@Override
	public BusinessProcess getBusinessProcess(String id) {

		BusinessProcess businessProcess = businessProcessDAO.findOne(id);
		return businessProcess;
	}

	@Override
	public BusinessProcess addBusinessProcess(String businessAreaId, BusinessProcess businessProcess) {

		BusinessArea businessArea = businessAreaDAO.findOne(businessAreaId);

		businessProcess.setBusinessArea(businessArea);
		businessProcess.setBusinessProcessStatus(businessProcess.getBusinessProcessStatus());

		businessProcess = businessProcessDAO.save(businessProcess);

		return businessProcess;
	}

}
