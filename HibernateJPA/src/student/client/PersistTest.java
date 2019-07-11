package student.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import pojopack.Students;

public class PersistTest {

	public static void main(String[] args) {
		org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration().configure("hibernate.anno.cfg.xml");
		SessionFactory emf = cfg.buildSessionFactory();
		Session em = emf.openSession();
		
		Students at  = new Students();
		//at.setstudentID(100);
		at.setCourseName("Persist1");
		at.setstudentAddress("Address1");
		at.setStudentName("Sweatha");
		at.setAge(100);
		em.saveOrUpdate(at);
		
		System.out.println("Save Or Update" + at.getStudentID());
	}

}
