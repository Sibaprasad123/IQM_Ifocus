/**
 * 
 */
package com.ifocus.IQM_tool.core.BusinessArea;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author IGS-Admin
 *
 */
@Service
public class BusinessAreaServieImpl implements BusinessAreaService {

	@Autowired
	private BusinessAreaDAO businessAreaDAO;

	@Override
	public List<BusinessArea> getAllBusinessAreas() {

		List<BusinessArea> businessAreaList = businessAreaDAO.findAll();

		return businessAreaList;
	}

	@Override
	public BusinessArea createNewBusinessArea(BusinessArea businessArea) {

		businessAreaDAO.save(businessArea);

		return businessArea;
	}

	@Override
	public BusinessArea updateBusinessArea(String areaid, BusinessArea businessArea) {

		businessArea = businessAreaDAO.findOne(areaid);
		if (businessArea != null) {
			businessArea = businessAreaDAO.save(businessArea);
		}

		return businessArea;
	}

	@Override
	public String deleteBusinessArea(String areaid) {
		// TODO Auto-generated method stub
		BusinessArea businessArea = businessAreaDAO.findOne(areaid);
		if (businessArea != null) {
			businessAreaDAO.delete(businessArea);
		}

		return "Deleted succesfully!!";

	}

}
