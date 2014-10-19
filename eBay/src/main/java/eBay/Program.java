package eBay;

import org.hibernate.Session;

import model.User;

public class Program {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		Session session = HibernateUtilities.getSessionFactory().openSession();

		session.beginTransaction();
		
		User user = new User();
		user.setName("Joe");
		user.setEmail("250");
		user.setpWord("150");
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		HibernateUtilities.getSessionFactory().close();
	}

}