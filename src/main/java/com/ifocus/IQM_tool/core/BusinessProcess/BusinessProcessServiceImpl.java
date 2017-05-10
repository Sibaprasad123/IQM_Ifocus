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

		businessProcess.setBusinessProcessStatus(BusinessProcessStatus.ACTIVE);

		businessProcess = businessProcessDAO.save(businessProcess);

		return businessProcess;
	}

	@Override
	public BusinessProcess updateProcessStatus(String processid, String status) throws Exception {

		BusinessProcess businessProcess = null;

		businessProcess = businessProcessDAO.findOne(processid);

		if (businessProcess != null) {

			businessProcess.setBusinessProcessStatus(BusinessProcessStatus.valueOf(status));

			businessProcessDAO.save(businessProcess);
		} else {
			throw new Exception("Business process doesn't exist");
		}

		return businessProcess;
	}

	@Override
	public String deleteProcessStatus(String processid) throws Exception {

		BusinessProcess businessProcess = null;

		businessProcess = businessProcessDAO.findOne(processid);

		if (businessProcess != null) {
			businessProcessDAO.delete(businessProcess);

		} else {
			throw new Exception("Business process doesn't exist");
		}

		return "Deleted successfully!";
	}

}
