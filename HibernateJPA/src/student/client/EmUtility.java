package student.client;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

public class EmUtility {
	
	private  static Session em;
	private  static ThreadLocal<Session> tlocal;
	private static SessionFactory emf;
	
	private EmUtility() {
		
	}
	
	static {
		tlocal = new ThreadLocal<Session>();
		org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration().configure("hibernate.anno.cfg.xml");
		emf = cfg.buildSessionFactory();
	}
	
	public static Session getSessionManager() {
		em = tlocal.get();
		if(em == null) {
			em = emf.openSession();
			tlocal.set(em);
			return em;
		}else {
			return em;
		}
		
	}

	public static void closeSessionManager() {
		em = tlocal.get();
		if(em != null ) {
			 em.close();
			 tlocal.remove();
		}
		else {
			System.out.println("No Entity Manager Created");
		}
		
	}
}
