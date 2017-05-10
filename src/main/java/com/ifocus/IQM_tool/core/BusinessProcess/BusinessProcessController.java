/**
 * 
 */
package com.ifocus.IQM_tool.core.BusinessProcess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IGS-Admin
 *
 */
@RestController
public class BusinessProcessController {

	@Autowired
	private BusinessProcessService businessProcessService;

	@RequestMapping("/businessareas/{id}/businessprocesses")
	public List<BusinessProcess> getAllBusinessProcesses(@PathVariable String id) {

		List<BusinessProcess> businessProcesses = businessProcessService.getAllBusinessProcesses(id);
		return businessProcesses;
	}

	@RequestMapping("/businessareas/{businessareaid}/businessprocesses/{id}")
	public BusinessProcess getBusinessProcess(@PathVariable String id) {
		BusinessProcess businessProcess = businessProcessService.getBusinessProcess(id);
		return businessProcess;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/businessareas/{areaid}/businessprocess")
	public BusinessProcess addBusinessProcess(@RequestBody BusinessProcess businessProcess,
			@PathVariable String areaid) {
		businessProcessService.addBusinessProcess(areaid, businessProcess);

		return businessProcess;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/businessprocess/{processid}/status")
	public BusinessProcess updateProcessStatus(@RequestBody String status, @PathVariable String processid)
			throws Exception {
		BusinessProcess businessProcess = null;
		businessProcess = businessProcessService.updateProcessStatus(processid, status);
		return businessProcess;
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/businessprocess/{processid}")
	public String deleteProcessStatus(@PathVariable String processid) throws Exception {

		String message = null;

		message = businessProcessService.deleteProcessStatus(processid);
		return message;
	}

}
