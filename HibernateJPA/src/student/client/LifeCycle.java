package student.client;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

import pojopack.Students;

public class LifeCycle {
public static void main(String[] args)throws Exception {
	
	org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration().configure("hibernate.anno.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	
	Session session=factory.openSession();
		
	Students user=(Students)session.get(Students.class, 2);
	System.out.println(user);
	//System.out.println(user.getUname()+":"+user.getUpass());
	
	new Thread(new Runnable() {
		@Override
		public void run() {
			Session session=factory.openSession();
			Students user=(Students)session.get(Students.class, 2);
			System.out.println(user);
			//System.out.println(user.getUname()+":"+user.getUpass());
		}
	}).start();
}
}
/**

Main difference between get() vs load method is that get() involves database hit if object doesn't 
exists in Session Cache and returns a fully initialized object which may involve several database 
call while load method can return proxy in place and only initialize the object or hit the database 
if any method other than getId() is called on persistent or entity object.

**/