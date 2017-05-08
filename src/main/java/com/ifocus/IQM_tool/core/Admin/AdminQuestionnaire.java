/**
 * 
 */
package com.ifocus.IQM_tool.core.Admin;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ifocus.IQM_tool.CommonUtils.AbstractDocument;
import com.ifocus.IQM_tool.core.BusinessProcess.BusinessProcess;
import com.ifocus.IQM_tool.core.User.Choices;
import com.ifocus.IQM_tool.core.Weightage.Weightage;



/**
 * @author IGS-Admin
 * 
 *         Admin Questionnaire
 *
 */

@Document
public class AdminQuestionnaire extends AbstractDocument {

	private String questionId;

	private String question;

	@DBRef
	private BusinessProcess businessProcess;

	private Set<Choices> choices;

	private Set<Weightage> weightage;

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
	public Set<Choices> getChoices() {
		return choices;
	}

	/**
	 * @param choices
	 *            the choices to set
	 */
	public void setChoices(Set<Choices> choices) {
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

}