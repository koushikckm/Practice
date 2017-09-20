package org.koushik.hibernate;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.koushik.hibernate.dto.EmployeeDetails;

public class HQLDemo {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String empId = "3";
		
		Query query = session.createQuery("from EmployeeDetails where employeeId > ?");
		
		//Parameter binding to overcome sql injection
		query.setInteger(0, Integer.parseInt(empId));
		
		//setting pagination
		query.setFirstResult(4);
		query.setMaxResults(3);
		
		List<EmployeeDetails> employees = (List<EmployeeDetails>)query.list();
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Result size = "+employees.size());
		for(EmployeeDetails e : employees){
			System.out.println(e.getEmployeeId() +": "+e.getEmployeeName());
		}
	}
}
