package single;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class UserClient {
public static void main(String[] args) {
	UserPojo upojo=new UserPojo();
	upojo.setFlag(0);
	upojo.setUname("ramesh");
	upojo.setUpass("turtle");
	upojo.setUserid(200);
	

	Configuration cfg=new AnnotationConfiguration().configure("hibernate.anno.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Session session=factory.openSession();
	
	session.save(upojo);
	
	
	session.beginTransaction().commit();
	
	
	
}
}
