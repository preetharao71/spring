package student.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pojopack.Students;

public class ClientJPA {

	public static void main(String args[]) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPASample");
		EntityManager em= (EntityManager) factory.createEntityManager();
		
		
		Students student1 = new Students();
		student1.setstudentID(100);
		student1.setCourseName("JPA");
		student1.setstudentAddress("Valasai");
		
		em.getTransaction().begin();
		em.persist(student1);
		em.getTransaction().commit();
		
	}
}
