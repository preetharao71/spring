package single;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class LifeCycleDemo {
public static void main(String[] args) {
	Configuration cfg=new AnnotationConfiguration().configure("hibernate.anno.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Session session=factory.openSession();
	
	UserPojo user=new UserPojo();
	user.setUserid(600);
	user.setUname("kamesh");
	user.setUpass("spider");
	user.setFlag(0);
	session.save(user);
	
	user.setFlag(1);
	
	session.beginTransaction().begin();
	session.beginTransaction().commit();
	
	UserPojo user1=(UserPojo)session.get(UserPojo.class, 600);
	
	System.out.println(user1.getFlag());
	
	user1.setUname("monish");
	
	session.beginTransaction().begin();
	session.beginTransaction().commit();
	
	UserPojo user2=(UserPojo)session.get(UserPojo.class, 600);
	System.out.println(user2.getUname());
	
}
}
