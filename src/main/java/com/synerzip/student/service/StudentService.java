package com.synerzip.student.service;

import org.hibernate.Session;

import com.synerzip.student.config.HibernateHandeller;
import com.synerzip.student.entity.StudentModel;

public class StudentService {

	public static void setRecord(StudentModel s) {
		Session session = HibernateHandeller.getSession();

		org.hibernate.Transaction tx = session.beginTransaction();

		try {
			session.save(s);
			tx.commit();
			System.out.println("data saved");
		} catch (Exception e) {
			System.out.println("something went wrong");
		} finally {
			session.close();
		}
	}

	public static void getRecord(int sid) {
		Session session = HibernateHandeller.getSession();

		org.hibernate.Transaction tx = session.beginTransaction();

		StudentModel s = null;

		try {
			s = (StudentModel) session.get(StudentModel.class, sid);
			tx.commit();
		} catch (Exception e) {
			System.out.println(s);
		} finally {
			session.close();
		}
	}
}
