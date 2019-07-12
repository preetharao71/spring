package single;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class ReadClient {
public static void main(String[] args)throws Exception {
	Configuration cfg=new AnnotationConfiguration().configure("hibernate.anno.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Session session=factory.openSession();
		
	UserPojo user=(UserPojo)session.get(UserPojo.class, 200);
	System.out.println(user);
	//System.out.println(user.getUname()+":"+user.getUpass());
	
	new Thread(new Runnable() {
		@Override
		public void run() {
			Session session=factory.openSession();
			UserPojo user=(UserPojo)session.get(UserPojo.class, 200);
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