/**
 * 
 */
package com.ifocus.IQM_tool.core.AuditRequest;

import java.util.List;

/**
 * @author IGS-Admin
 *
 */
public class AuditReqCreateObject {

	private List<String> questionnaires;

	private String remarks;

	/**
	 * @return the questionnaires
	 */
	public List<String> getQuestionnaires() {
		return questionnaires;
	}

	/**
	 * @param questionnaires
	 *            the questionnaires to set
	 */
	public void setQuestionnaires(List<String> questionnaires) {
		this.questionnaires = questionnaires;
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
