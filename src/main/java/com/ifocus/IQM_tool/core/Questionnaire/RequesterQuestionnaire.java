/**
 * 
 */
package com.ifocus.IQM_tool.core.Questionnaire;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ifocus.IQM_tool.CommonUtils.Image;
import com.ifocus.IQM_tool.core.BusinessProcess.BusinessProcess;
import com.ifocus.IQM_tool.core.User.Choices;
import com.ifocus.IQM_tool.core.Weightage.Weightage;



/**
 * @author IGS-Admin
 *
 *
 *         Requester Questionnaire set
 */

@Document
public class RequesterQuestionnaire {

	@Id
	private String id;

	private String questionId;

	private String question;

	@DBRef
	private BusinessProcess businessProcess;

	private Choices choices;

	private Set<Weightage> weightage;

	private List<Image> artifacts;

	private String remarks;

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
	 * @return the questionId
	 */
	public String getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId
	 *            the questionId to set
	 */
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the businessProcess
	 */
	public BusinessProcess getBusinessProcess() {
		return businessProcess;
	}

	/**
	 * @param businessProcess
	 *            the businessProcess to set
	 */
	public void setBusinessProcess(BusinessProcess businessProcess) {
		this.businessProcess = businessProcess;
	}

	/**
	 * @return the choices
	 */
	public Choices getChoices() {
		return choices;
	}

	/**
	 * @param choices
	 *            the choices to set
	 */
	public void setChoices(Choices choices) {
		this.choices = choices;
	}

	/**
	 * @return the weightage
	 */
	public Set<Weightage> getWeightage() {
		return weightage;
	}

	/**
	 * @param weightage
	 *            the weightage to set
	 */
	public void setWeightage(Set<Weightage> weightage) {
		this.weightage = weightage;
	}

	/**
	 * @return the artifacts
	 */
	public List<Image> getArtifacts() {
		return artifacts;
	}

	/**
	 * @param artifacts
	 *            the artifacts to set
	 */
	public void setArtifacts(List<Image> artifacts) {
		this.artifacts = artifacts;
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
