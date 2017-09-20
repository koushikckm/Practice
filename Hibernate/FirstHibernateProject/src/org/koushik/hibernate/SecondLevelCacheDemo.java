package org.koushik.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.koushik.hibernate.dto.EmployeeDetails;

public class SecondLevelCacheDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		EmployeeDetails employee = (EmployeeDetails)session.get(EmployeeDetails.class, 1);
				
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		
		EmployeeDetails employee2 = (EmployeeDetails)session2.get(EmployeeDetails.class, 1);

		session2.getTransaction().commit();
		session2.close();
		
	}
}
