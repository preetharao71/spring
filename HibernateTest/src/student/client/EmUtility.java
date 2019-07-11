package student.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtility {
	
	private  static EntityManager em;
	private  static ThreadLocal<EntityManager> tlocal;
	private static EntityManagerFactory emf;
	
	private EmUtility() {
		
	}
	
	static {
		tlocal = new ThreadLocal<EntityManager>();
		emf = Persistence.createEntityManagerFactory("TestJPA");
	}
	
	public static EntityManager getEntityManager() {
		em = tlocal.get();
		if(em == null) {
			em = emf.createEntityManager();
			tlocal.set(em);
			return em;
		}else {
			return em;
		}
		
	}

	public static void closeEntityManager() {
		em = tlocal.get();
		if(em != null ) {
			 em.close();
			 tlocal.remove();
		}
		else {
			System.out.println("No Entity Manager Created");
		}
		
	}
}
