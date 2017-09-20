package org.koushik.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.koushik.hibernate.dto.EmployeeDetails;

public class QueryCacheDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from EmployeeDetails emp where emp.employeeId=1");
		//setting query cache
		query.setCacheable(true);
		
		List employees = query.list();
		
				
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		
		Query query2 = session2.createQuery("from EmployeeDetails emp where emp.employeeId=1");
		//setting query cache
		query2.setCacheable(true);
				
		employees = query2.list();
		
		session2.getTransaction().commit();
		session2.close();
	}

}
