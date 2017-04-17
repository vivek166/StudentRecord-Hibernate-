package com.synerzip.student.app;

import com.synerzip.student.entity.StudentModel;
import com.synerzip.student.service.StudentService;

public class StudentApp {

	public static void main(String[] args) throws Exception {

		StudentModel s = new StudentModel(8, "vivek", 114);
		StudentService.setRecord(s);
		
		StudentService.getRecord(1);
	}
}
