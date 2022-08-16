
package com.java.mypackage;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name= "emp01")

public class Employee {

@Id

private int empno;

private String name;

private String designation;

float sal;

public int getEmpno() {
	return empno;
}

public void setEno(int empno) {
	this.empno = empno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public float getSal() {
	return sal;
}

public void setSal(float sal) {
	this.sal = sal;
}



}