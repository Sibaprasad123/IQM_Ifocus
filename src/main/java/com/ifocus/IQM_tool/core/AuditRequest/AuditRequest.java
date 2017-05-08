/**
 * 
 */
package com.ifocus.IQM_tool.core.AuditRequest;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ifocus.IQM_tool.CommonUtils.AbstractDocument;
import com.ifocus.IQM_tool.core.Admin.AdminQuestionnaire;
import com.ifocus.IQM_tool.core.BusinessArea.BusinessArea;
import com.ifocus.IQM_tool.core.User.ApplicationStatus;
import com.ifocus.IQM_tool.core.User.User;



/**
 * @author IGS-Admin
 *
 */
@Document
public class AuditRequest extends AbstractDocument {

	@DBRef
	private User requester;

	@DBRef
	private User auditor;

	@DBRef
	private BusinessArea businessArea;

	@DBRef
	private List<AdminQuestionnaire> questionnaires;

	private ApplicationStatus applicationStatus;

	private AuditStatus auditStatus;

	private Date expiryDate;

	private String remarks;

	/**
	 * @return the requester
	 */
	public User getRequester() {
		return requester;
	}

	/**
	 * @param requester
	 *            the requester to set
	 */
	public void setRequester(User requester) {
		this.requester = requester;
	}

	/**
	 * @return the auditor
	 */
	public User getAuditor() {
		return auditor;
	}

	/**
	 * @param auditor
	 *            the auditor to set
	 */
	public void setAuditor(User auditor) {
		this.auditor = auditor;
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
	 * @return the questionnaires
	 */
	public List<AdminQuestionnaire> getQuestionnaires() {
		return questionnaires;
	}

	/**
	 * @param questionnaires
	 *            the questionnaires to set
	 */
	public void setQuestionnaires(List<AdminQuestionnaire> questionnaires) {
		this.questionnaires = questionnaires;
	}

	/**
	 * @return the applicationStatus
	 */
	public ApplicationStatus getApplicationStatus() {
		return applicationStatus;
	}

	/**
	 * @param applicationStatus
	 *            the applicationStatus to set
	 */
	public void setApplicationStatus(ApplicationStatus applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	/**
	 * @return the auditStatus
	 */
	public AuditStatus getAuditStatus() {
		return auditStatus;
	}

	/**
	 * @param auditStatus
	 *            the auditStatus to set
	 */
	public void setAuditStatus(AuditStatus auditStatus) {
		this.auditStatus = auditStatus;
	}

	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate
	 *            the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}