/**
 * 
 */
package com.ifocus.IQM_tool.core.Questionnaire;

import java.util.Set;

/**
 * @author IGS-Admin
 *
 */
public class ReqQuesCreateObject {

	private String questionId;

	private String question;

	private String choice;

	private Set<String> weightage;

	private String remarks;

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
	 * @return the choice
	 */
	public String getChoice() {
		return choice;
	}

	/**
	 * @param choice
	 *            the choice to set
	 */
	public void setChoice(String choice) {
		this.choice = choice;
	}

	/**
	 * @return the weightage
	 */
	public Set<String> getWeightage() {
		return weightage;
	}

	/**
	 * @param weightage
	 *            the weightage to set
	 */
	public void setWeightage(Set<String> weightage) {
		this.weightage = weightage;
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
