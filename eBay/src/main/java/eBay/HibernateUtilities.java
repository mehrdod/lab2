package eBay;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateUtilities {

	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	static Session session;
	public HibernateUtilities(){
		try{
			session = sessionFactory.openSession();
		}
		catch(HibernateException exception)
		{
			System.out.println(exception.fillInStackTrace());
		}
	}
	
	static
	{
		try
		{
			Configuration configuration = new Configuration().configure();
			
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}
		catch(HibernateException exception)
		{
			System.out.println(exception.fillInStackTrace());
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
