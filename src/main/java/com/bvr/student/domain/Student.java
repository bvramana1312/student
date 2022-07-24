package com.bvr.student.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student_tbl")
public class Student implements Serializable{
	
	private static final long serialVersionUID = -2228784815938588107L;
	
	@Id
	@Column(name="student_id")
	int studentId;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="father_name")
	String fatherName;
	
	@Column(name="monther_name")
	String montherName;
	
	@Column(name="date_of_birth")
	Date dateOfBirth;
	
	@Column(name="acadamic_year")
	String acadamicYear;
	
	@Column(name="contact_id")
	int contactId;
	
	@Column(name="created_by")
	int createdBy;
	
	@Column(name="created_date")
	Date createdDate;
	
	@Column(name="updated_date")
	Date updatedDate;
	
	@Column(name="date_of_join")
	Date dateOfJoin;
	
	@Column(name="class_of_join")
	String classOfJoin;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMontherName() {
		return montherName;
	}

	public void setMontherName(String montherName) {
		this.montherName = montherName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAcadamicYear() {
		return acadamicYear;
	}

	public void setAcadamicYear(String acadamicYear) {
		this.acadamicYear = acadamicYear;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getClassOfJoin() {
		return classOfJoin;
	}

	public void setClassOfJoin(String classOfJoin) {
		this.classOfJoin = classOfJoin;
	}
	
}
