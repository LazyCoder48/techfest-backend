package com.techfest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "usersTable")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "uniqueId_generator")
	@SequenceGenerator(name="uniqueId_generator", sequenceName = "uniqueId_sequence")
	@Column(name="id", updatable = false, nullable = false)
	private Long id;

	@Column(name="first_name", nullable=false)
	private String firstName;

	@Column(name="last_name", nullable=false)
	private String lastName;

	@Column(name="email", nullable=false, unique=true)
	private String email;

	@Column(name="password", nullable=false)
	private String password;

	@Column(name="college", nullable=false)
	private String college;

	@Column(name="college_url", nullable=false)
	private String collegeUrl;

	@Column(name="phone_number", nullable=false)
	private String phoneNumber;

	@Column(name="encrypted_password", nullable=false)
	private String encryptedPassword;

	@Column(name="dob", nullable=false)
	private String dob;

	@Column(name="passphrase", nullable=false)
	private String passphrase;

	@Column(name="user_name", nullable=false, unique=true)
	private String userName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCollegeUrl() {
		return collegeUrl;
	}

	public void setCollegeUrl(String collegeUrl) {
		this.collegeUrl = collegeUrl;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassphrase() {
		return passphrase;
	}

	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [Id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", college=" + college + ", collegeUrl=" + collegeUrl + ", phoneNumber="
				+ phoneNumber + ", encryptedPassword=" + encryptedPassword + ", dob=" + dob + ", passphrase="
				+ passphrase + ", userName=" + userName + "]";
	}
	
	

}
