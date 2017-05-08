/**
 * 
 */
package com.ifocus.IQM_tool.core.BusinessProcess;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ifocus.IQM_tool.core.BusinessArea.BusinessArea;

/**
 * @author IGS-Admin
 *
 */
@Document
public class BusinessProcess /* extends AbstractDocument */ {

	@Id
	private String id;

	private String businessProcessId;

	private String businessProcessName;

	private BusinessProcessStatus status;

	@DBRef
	private BusinessArea businessArea;

	public BusinessProcess() {

	}

	/**
	 * @return the businessArea
	 */
	public BusinessArea getBusinessArea() {
		return businessArea;
	}

	/**
	 * @param businessArea
	 *            the businessArea to set
	 */
	public void setBusinessArea(BusinessArea businessArea) {
		this.businessArea = businessArea;
	}

	/**
	 * @return the businessProcessId
	 */
	public String getBusinessProcessId() {
		return businessProcessId;
	}

	/**
	 * @param businessProcessId
	 *            the businessProcessId to set
	 */
	public void setBusinessProcessId(String businessProcessId) {
		this.businessProcessId = businessProcessId;
	}

	/**
	 * @return the businessProcessName
	 */
	public String getBusinessProcessName() {
		return businessProcessName;
	}

	/**
	 * @param businessProcessName
	 *            the businessProcessName to set
	 */
	public void setBusinessProcessName(String businessProcessName) {
		this.businessProcessName = businessProcessName;
	}

	/**
	 * @return the businessProcessStatus
	 */
	public BusinessProcessStatus getBusinessProcessStatus() {
		return status;
	}

	/**
	 * @param businessProcessStatus
	 *            the businessProcessStatus to set
	 */
	public void setBusinessProcessStatus(BusinessProcessStatus businessProcessStatus) {
		this.status = businessProcessStatus;
	}

}