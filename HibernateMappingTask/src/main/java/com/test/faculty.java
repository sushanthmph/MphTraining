package com.test;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="faculties")
public class faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String f_name;
private int f_salary;
@OneToMany(targetEntity = Student.class,fetch = FetchType.EAGER)
private List<Student> std;


public List<Student> getStd() {
	return std;
}
public void setStd(List<Student> std) {
	this.std = std;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name = f_name;
}
public int getF_salary() {
	return f_salary;
}
public void setF_salary(int f_salary) {
	this.f_salary = f_salary;
}

}