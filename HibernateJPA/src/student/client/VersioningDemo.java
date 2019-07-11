package student.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import pojopack.Students;

public class VersioningDemo {
public static void main(String[] args) {
	org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration().configure("hibernate.anno.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	

		
	new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("thread called...");
			Session session=factory.openSession();
			session.beginTransaction().begin();
			Students user2 =(Students)session.get(Students.class, 2);
			user2.setStudentName("new ..kk.....");
			System.out.println("Thread before  commit...");
			session.beginTransaction().commit();
		}
	}).start();
	
	Session msession=factory.openSession();
	msession.beginTransaction().begin();
	Students user2 =(Students)msession.get(Students.class, 1);
	user2.setStudentName("new ...me...");
	System.out.println("before sleep...");
	try {Thread.sleep(4000);}catch(Exception e) {}
	System.out.println("before sleep...");
	msession.beginTransaction().commit();
	System.out.println("after theread commit...");

}
}
