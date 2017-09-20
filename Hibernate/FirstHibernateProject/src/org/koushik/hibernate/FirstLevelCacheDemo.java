package org.koushik.hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.koushik.hibernate.dto.Book;

public class FirstLevelCacheDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Book book = (Book)session.get(Book.class, 1);
				
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		
		Book book2 = (Book)session2.get(Book.class, 1);
		
		session2.getTransaction().commit();
		session2.close();
		
	}

}
