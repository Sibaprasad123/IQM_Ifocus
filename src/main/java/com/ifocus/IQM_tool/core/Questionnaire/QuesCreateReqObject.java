/**
 * 
 */
package com.ifocus.IQM_tool.core.Questionnaire;

import java.util.Set;

/**
 * @author IGS-Admin
 *
 */
public class QuesCreateReqObject {

	private String questionId;

	private String question;

	private Set<String> choices;

	private Set<String> weightage;

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
	 * @return the choices
	 */
	public Set<String> getChoices() {
		return choices;
	}

	/**
	 * @param choices
	 *            the choices to set
	 */
	public void setChoices(Set<String> choices) {
		this.choices = choices;
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

}
