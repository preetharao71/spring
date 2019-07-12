package single;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class ReadUpdateMergeDemo {
public static void main(String[] args) {
	Configuration cfg=new AnnotationConfiguration().configure("hibernate.anno.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	UserPojo user1 = new UserPojo();
	user1.setUserid(200);
	user1.setUname("kumar");
	
	//create session
	Session session1 = factory.openSession();
	
	session1.saveOrUpdate(user1);
	session1.close();
	//user1 object in detached state now

	//user1.setUname("somu");//Updated Name
	//Create session again
	Session session2 = factory.openSession();
	UserPojo user2 =(UserPojo)session2.get(UserPojo.class, 200);
	//user2 object in persistent state with id 200

	//below we try to make on detached object with id 200 to persistent state 
	//by using update method of hibernate
	//session2.update(user1);//It occurs the exception NonUniqueObjectException 
	//because user2 object is having user with same userid as 200. 
	//In order to avoid this exception we are using merge like given below 
	//instead of session.update(user1);
	//System.out.println(user2.getUname());
	//session2.merge(user1); //it merge the object state with user2
	session2.update(user1); //Now it will work with exception
	System.out.println(user1.getUname()+":"+user2.getUname());
}
}
