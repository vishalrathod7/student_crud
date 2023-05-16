package org.jsp.student_crud.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Component
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 int id;
 String name;
 int standard;
 long mobile;
 int english_marks;
 int hindi_marks;
 int maths_marks;
 double percentage;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStandard() {
	return standard;
}
public void setStandard(int standard) {
	this.standard = standard;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public int getEnglish_marks() {
	return english_marks;
}
public void setEnglish_marks(int english_marks) {
	this.english_marks = english_marks;
}
public int getHindi_marks() {
	return hindi_marks;
}
public void setHindi_marks(int hindi_marks) {
	this.hindi_marks = hindi_marks;
}
public int getMaths_marks() {
	return maths_marks;
}
public void setMaths_marks(int maths_marks) {
	this.maths_marks = maths_marks;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", standard=" + standard + ", mobile=" + mobile + ", english_marks="
			+ english_marks + ", hindi_marks=" + hindi_marks + ", maths_marks=" + maths_marks + ", percentage="
			+ percentage + "]";
}

 
 
}
