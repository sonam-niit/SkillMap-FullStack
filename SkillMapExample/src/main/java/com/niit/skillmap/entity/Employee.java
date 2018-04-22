package com.niit.skillmap.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private String employeePhone;
	private String employeeCity;
	private String employeeQualification;
	private String employeeSkill;
	private String employeeCertification;
	private String employeeRole;
	private Date date_of_joining;
	private boolean status;
	
	private String employeePassword;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	public String getEmployeeQualification() {
		return employeeQualification;
	}
	public void setEmployeeQualification(String employeeQualification) {
		this.employeeQualification = employeeQualification;
	}
	public String getEmployeeSkill() {
		return employeeSkill;
	}
	public void setEmployeeSkill(String employeeSkill) {
		this.employeeSkill = employeeSkill;
	}
	public String getEmployeeCertification() {
		return employeeCertification;
	}
	public void setEmployeeCertification(String employeeCertification) {
		this.employeeCertification = employeeCertification;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeePhone=" + employeePhone + ", employeeCity=" + employeeCity
				+ ", employeeQualification=" + employeeQualification + ", employeeSkill=" + employeeSkill
				+ ", employeeCertification=" + employeeCertification + ", employeeRole=" + employeeRole
				+ ", date_of_joining=" + date_of_joining + ", status=" + status + ", employeePassword="
				+ employeePassword + "]";
	}
	
	
	
}
