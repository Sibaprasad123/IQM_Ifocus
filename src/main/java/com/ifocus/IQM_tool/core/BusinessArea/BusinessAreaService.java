/**
 * 
 */
package com.ifocus.IQM_tool.core.BusinessArea;

import java.util.List;

/**
 * @author IGS-Admin
 *
 */
public interface BusinessAreaService {

	List<BusinessArea> getAllBusinessAreas();

	BusinessArea createNewBusinessArea(BusinessArea businessArea);

	BusinessArea updateBusinessArea(String areaid, BusinessArea businessArea);

	String deleteBusinessArea(String areaid);

}
