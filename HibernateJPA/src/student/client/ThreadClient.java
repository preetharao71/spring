package student.client;

import org.hibernate.classic.Session;

import pojopack.Students;

public class ThreadClient {

	public static void main(String[] args) throws InterruptedException {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Session em = EmUtility.getSessionManager();
				System.out.println("Thread id=======1 : "+ em);
				Students st = (Students) em.get(Students.class,500);
			
				em =EmUtility.getSessionManager();
				System.out.println("Selected "+ st.getStudentID());
				
				
			
					Students st1 = new Students();
					st1.setStudentID(900);
					st1.setStudentName("NewHiber");
					st1.setstudentAddress("TestAddHibernate");
					em.save(st1);
					System.out.println("Added======student name "+ st1.getStudentID());
					em.delete(st);
					System.out.println("Deleted======student name "+ st.getStudentID());
					
					Students st2 = new Students();
					st2.setStudentID(700);
					st2.setStudentName("777000000Test");
					st2.setstudentAddress("777000TestAddHibernate");
					System.out.println("Updated======student name "+ st2.getStudentID());
					em.save(st1);
					
					em.getTransaction().begin();
					
					em.getTransaction().commit();
			
			}
		}).start();
	

}
}
