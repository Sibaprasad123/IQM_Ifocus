/**
 * 
 */
package com.ifocus.IQM_tool.core.BusinessArea;

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
public class BusinessAreaController {

	@Autowired
	private BusinessAreaService businessAreaService;

	@RequestMapping("/businessareas")
	public List<BusinessArea> getAllBusinessArea() {

		List<BusinessArea> businessAreaList = businessAreaService.getAllBusinessAreas();

		return businessAreaList;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/businessareas")
	public BusinessArea createNewBusinessArea(@RequestBody BusinessArea businessArea) {

		businessArea = businessAreaService.createNewBusinessArea(businessArea);

		return businessArea;
	}
}
