package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String s_name;
private String roll;
private String college;
private int s_fees;
@ManyToOne(targetEntity = faculty.class,fetch = FetchType.LAZY)
private faculty f;

public faculty getF() {
	return f;
}
public void setF(faculty f) {
	this.f = f;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public String getRoll() {
	return roll;
}
public void setRoll(String roll) {
	this.roll = roll;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public int getS_fees() {
	return s_fees;
}
public void setS_fees(int s_fees) {
	this.s_fees = s_fees;
}

}