package com.greatlearning.employeemgmt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "employees")
public class Employee {
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="emp_id")
     private int empId;
	 @Column(name="emp_first_name")
     private String empFirstName;
	 @Column(name="emp_last_name")
     private String empLastName;
	 @Column(name="emp_email")
     private String empEmail;
	 
	 
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int emId, int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	  
}
