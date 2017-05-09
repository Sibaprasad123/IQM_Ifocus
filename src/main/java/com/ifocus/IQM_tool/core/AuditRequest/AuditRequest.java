/**
 * 
 */
package com.ifocus.IQM_tool.core.AuditRequest;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ifocus.IQM_tool.CommonUtils.AbstractDocument;
import com.ifocus.IQM_tool.core.Questionnaire.RequesterQuestionnaire;
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
	private List<RequesterQuestionnaire> questionnaires;

	private AuditStatus auditStatus;

	private Date expiryDate;

	private String remarks;

	private double auditScore;

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
	 * @return the questionnaires
	 */
	public List<RequesterQuestionnaire> getQuestionnaires() {
		return questionnaires;
	}

	/**
	 * @param questionnaires
	 *            the questionnaires to set
	 */
	public void setQuestionnaires(List<RequesterQuestionnaire> questionnaires) {
		this.questionnaires = questionnaires;
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

	/**
	 * @return the auditScore
	 */
	public double getAuditScore() {
		return auditScore;
	}

	/**
	 * @param auditScore
	 *            the auditScore to set
	 */
	public void setAuditScore(double auditScore) {
		this.auditScore = auditScore;
	}

}