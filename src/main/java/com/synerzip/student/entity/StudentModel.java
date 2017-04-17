package com.synerzip.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentModel {

	@Id
	private int studentId;
	private String studentName;
	private int studentRollNumber;

	@Override
	public String toString() {
		return "StudentModel [studentId=" + studentId + ", studentName=" + studentName + ", studentRollNumber="
				+ studentRollNumber + "]";
	}

	public StudentModel() {
		
	}
	
	
	public StudentModel(int sid, String sname, int srollno) {
		studentId= sid;
		studentName = sname;
		studentRollNumber = srollno;
	}
}
