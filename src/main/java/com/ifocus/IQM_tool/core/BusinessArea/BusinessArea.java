/**
 * 
 */
package com.ifocus.IQM_tool.core.BusinessArea;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author IGS-Admin
 *
 */
@Document
public class BusinessArea /* extends AbstractDocument */ {

	@Id
	private String id;

	private String businessAreaId;

	private String businessAreaName;

	private BusinessAreaStatus status;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the businessAreaId
	 */
	public String getBusinessAreaId() {
		return businessAreaId;
	}

	/**
	 * @param businessAreaId
	 *            the businessAreaId to set
	 */
	public void setBusinessAreaId(String businessAreaId) {
		this.businessAreaId = businessAreaId;
	}

	/**
	 * @return the businessAreaName
	 */
	public String getBusinessAreaName() {
		return businessAreaName;
	}

	/**
	 * @param businessAreaName
	 *            the businessAreaName to set
	 */
	public void setBusinessAreaName(String businessAreaName) {
		this.businessAreaName = businessAreaName;
	}

	/**
	 * @return the status
	 */
	public BusinessAreaStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(BusinessAreaStatus status) {
		this.status = status;
	}

}