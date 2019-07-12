package single;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class GetLoadDemo {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration().configure("hibernate.anno.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Session session=factory.openSession();
				
				UserPojo user=(UserPojo)session.get(UserPojo.class, 200);
				System.out.println(user);
				
			}
		}).start();

		Session session=factory.openSession();
		
		UserPojo user=(UserPojo)session.get(UserPojo.class, 200);
		System.out.println(user);		
	}
}
