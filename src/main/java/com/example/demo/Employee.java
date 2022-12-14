package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="NNRG_Employees")
public class Employee {
	@Id
	public String id;
	
	public String empNum;
	public String empfirstName;
	public String emplastName;
	public int empSalary;
	public Employee(String id,String empNum,String empfirstName,String emplastName,int empSalary) {
		this.id=id;
		this.empNum=empNum;
		this.empfirstName=empfirstName;
		this.emplastName=emplastName;
		this.empSalary=empSalary;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	public String getEmpfirstName() {
		return empfirstName;
	}
	public void setEmpFirstName(String empfirstName) {
		this.empfirstName = empfirstName;
	}
	public String getEmpLastName() {
		return emplastName;
	}
	public void setEmpLastName(String emplastName) {
		this.emplastName = emplastName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	

}
