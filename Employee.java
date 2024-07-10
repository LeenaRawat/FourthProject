package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String empname;
	private Long Salary;
	private String gender;
	private String mobile;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String empname, Long salary, String gender, String mobile) {
		super();
		this.id = id;
		this.empname = empname;
		Salary = salary;
		this.gender = gender;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Long getSalary() {
		return Salary;
	}

	public void setSalary(Long salary) {
		Salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
