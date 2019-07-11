package student.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import pojopack.Students;

public class HibGetLoad {
	Session session;
	HibGetLoad(){
	
	 org.hibernate.cfg.Configuration cfg = new AnnotationConfiguration().configure("hibernate.anno.cfg.xml");
	 SessionFactory emf = cfg.buildSessionFactory();
	  session = emf.openSession();
	}
	
	public static void main(String args[]) {
		 org.hibernate.cfg.Configuration cfg = new AnnotationConfiguration().configure("hibernate.anno.cfg.xml");
		 SessionFactory emf = cfg.buildSessionFactory();
		  Session session = emf.openSession();
		//HibGetLoad obj=new HibGetLoad();
		  System.out.println("before load...");
		Students student1  = (Students) session.load(Students.class, new Integer(1));
		System.out.println("before method called...");
		System.out.println("called..."+student1.getStudentName());
		System.out.println("Load Student" +student1.getStudentID() +"\n Course Name -" + student1.getStudentName());
		//getStudent();
		//obj.loadStudent();
		//obj.updateStudent();
	}

	/* Get Will refere primary cache --> secondary --> DB . Does Eager */
	public  void getStudent() {
		Students student  = (Students) session.get(Students.class, 1);
		System.out.println("Get Student " + student.getStudentID() +"\n Course Name - " + student.getStudentName());
		Students student1  = (Students) session.get(Students.class, 1);
		System.out.println("Get Student " + student1.getStudentID() +"\n Course Name - " + student1.getStudentName());
	}

	/* Lazy Loading */
	public  void loadStudent() {
		Students student1  = (Students) session.load(Students.class, 1);
		System.out.println("Load Student" +student1.getStudentID() +"\n Course Name -" + student1.getStudentName());
	}
	
	
	public  void updateStudent() {
		Students student1  = (Students) session.load(Students.class, 2);
		student1.setCourseName("Update JS");
		session.getTransaction().begin();
		session.getTransaction().commit();
		System.out.println("Load Student" +student1.getStudentID() +"\n Course Name -" + student1.getStudentName() + "------" + student1.getCourseName());
	}
}
