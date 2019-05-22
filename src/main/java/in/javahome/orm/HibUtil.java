package in.javahome.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {
	
	private static Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	private static SessionFactory sessionFactory = cfg.buildSessionFactory();
	
	public static Session getSession() {
		return sessionFactory.openSession();
	}

}
