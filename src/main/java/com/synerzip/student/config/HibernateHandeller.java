package com.synerzip.student.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.synerzip.student.entity.StudentModel;

public class HibernateHandeller {

	public static Session getSession(){
		
		
		/*Configuration con = new Configuration().configure();
		org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();*/
		
		Configuration con = new Configuration().configure().addAnnotatedClass(StudentModel.class);
		
		SessionFactory sf = con.buildSessionFactory();
		return sf.openSession();
	}
}
