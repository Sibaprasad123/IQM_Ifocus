/**
 * 
 */
package com.ifocus.IQM_tool.core.Weightage;

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
public class WeightageController {

	@Autowired
	private WeightageService weightageService;

	@RequestMapping("/weightages")
	private List<Weightage> getAllWeightages() {

		List<Weightage> weightageList = weightageService.getAllWeightages();

		return weightageList;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/weightages")
	public Weightage createWeightage(@RequestBody Weightage weightage) {

		weightage = weightageService.createWeightage(weightage);

		return weightage;
	}

}
