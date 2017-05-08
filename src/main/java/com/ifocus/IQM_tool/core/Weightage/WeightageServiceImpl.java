/**
 * 
 */
package com.ifocus.IQM_tool.core.Weightage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author IGS-Admin
 *
 */
@Service
public class WeightageServiceImpl implements WeightageService {

	@Autowired
	private WeightageDAO weightageDAO;

	@Override
	public List<Weightage> getAllWeightages() {

		List<Weightage> weightageList = weightageDAO.findAll();

		return weightageList;
	}

	@Override
	public Weightage createWeightage(Weightage weightage) {

		weightage = weightageDAO.save(weightage);

		return weightage;
	}

}
