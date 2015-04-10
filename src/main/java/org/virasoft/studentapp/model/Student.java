package org.virasoft.studentapp.model;

import java.util.Date;
import org.springframework.data.annotation.Id;

public class Student {

	// id will be used for storing MongoDB _id
	@Id
	private String id;
	private long studentNumber;
	private String gender;
	private Date birthDate;
	private boolean disability;
	private String firstName;
	private String lastName;
	private String email;

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
	 * @return the studentNumber
	 */
	public long getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber
	 *            the studentNumber to set
	 */
	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
	}

	/**
	 * @return the gender
	 */
	public String isGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the disability
	 */
	public boolean isDisability() {
		return disability;
	}

	/**
	 * @param disability
	 *            the disability to set
	 */
	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}