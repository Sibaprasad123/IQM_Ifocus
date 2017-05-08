/**
 * 
 */
package com.ifocus.IQM_tool.core.Weightage;

import java.util.List;

/**
 * @author IGS-Admin
 *
 */
public interface WeightageService {

	List<Weightage> getAllWeightages();

	Weightage createWeightage(Weightage weightage);
	
}
