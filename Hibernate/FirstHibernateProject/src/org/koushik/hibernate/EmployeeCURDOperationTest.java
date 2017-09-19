package org.koushik.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.koushik.hibernate.dto.EmployeeDetails;

public class EmployeeCURDOperationTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// CREATE OPERATION - creating 10 records
		/*
		for (int i = 0; i < 10; i++) {
			EmployeeDetails employee = new EmployeeDetails();
			employee.setEmployeeName("Employee " + i);
			session.save(employee);
		}*/
		
		// READ OPERATION
		EmployeeDetails employee = (EmployeeDetails)session.get(EmployeeDetails.class, 9);
		System.out.println(employee.getEmployeeName());
		
		// DELETE OPERATION
		/*EmployeeDetails employee1 = (EmployeeDetails)session.get(EmployeeDetails.class, 6);
		session.delete(employee1);*/
		
		// UPDATE OPERATION
		EmployeeDetails employee2 = (EmployeeDetails)session.get(EmployeeDetails.class, 9);
		employee2.setEmployeeName("Updated employee name");
		session.update(employee2);
		
		
		session.getTransaction().commit();
		session.close();
	}

}
