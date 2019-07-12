package single;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class VersioningDemo {
public static void main(String[] args) {
	Configuration cfg=new AnnotationConfiguration().configure("hibernate.anno.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("thread called...");
			Session session=factory.openSession();
			session.beginTransaction().begin();
			UserPojo user2 =(UserPojo)session.get(UserPojo.class, 200);
			user2.setUname("new ..kk.....");
			session.beginTransaction().commit();
		}
	}).start();
	
	Session msession=factory.openSession();
	msession.beginTransaction().begin();
	UserPojo user2 =(UserPojo)msession.get(UserPojo.class, 200);
	user2.setUname("new ...me...");
	try {Thread.sleep(4000);}catch(Exception e) {}
	msession.beginTransaction().commit();
	
}
}
