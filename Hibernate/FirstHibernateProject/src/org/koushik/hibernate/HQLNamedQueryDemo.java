package org.koushik.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.koushik.hibernate.dto.EmployeeDetails;

public class HQLNamedQueryDemo {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		/*Query query = session.getNamedQuery("EmployeeDetails.byId");
		query.setInteger(0, 3);
		
		List<EmployeeDetails> employees = (List<EmployeeDetails>)query.list();*/
		
		Query query = session.getNamedQuery("EmployeeDetails.byName");
		query.setString(0, "Employee 2");
		
		List<EmployeeDetails> employees = (List<EmployeeDetails>)query.list();
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Result size = "+employees.size());
		for(EmployeeDetails e : employees){
			System.out.println(e.getEmployeeId() +": "+e.getEmployeeName());
		}
	}
}
