package student.client;

import javax.persistence.EntityManager;

import pojopack.Students;

public class ThreadClient {

	public static void main(String[] args) throws InterruptedException {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				EntityManager em = EmUtility.getEntityManager();
				System.out.println("Thread id=======1 : "+ em);
				Students st = em.find(Students.class,100);
				System.out.println("Thread id=======1 : "+ st.getStudentID());
				st.setCourseName("TTTTTTTT");
				EmUtility.closeEntityManager();
				em =EmUtility.getEntityManager();
				System.out.println("Thread id======2 "+ st.getCourseName());
				
				Students st1 = new Students();
				st1.setstudentID(200);
				st1.setstudentName("BBBBBBB");
				st1.setstudentAddress("CCCCC");
				
				
				em.getTransaction().begin();
				em.getTransaction().commit();
				
				
				em =EmUtility.getEntityManager();
				System.out.println("Thread id======3 "+ em);
				
				
				em =EmUtility.getEntityManager();
				System.out.println("Thread id======5 "+ em);
				em =EmUtility.getEntityManager();
				System.out.println("Thread id======6 "+ em);
			}
		}).start();
	
	EntityManager em =EmUtility.getEntityManager();
	System.out.println("Thread id======4 "+ em);
	Thread.sleep(50000);
}
}
