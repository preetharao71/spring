package student.client;

import java.util.Iterator;

import org.hibernate.Session;

import multiinhertpack.Automobile;
import multiinhertpack.Car;
import multiinhertpack.Maruti;

public class HibetClient {
	
	public static void main(String args[]) {
		readPolyQuery();
	}	
	
	public static void readPolyQuery() {
		
		Session em = EmUtility.getSessionManager();
		org.hibernate.Query query = (org.hibernate.Query) em.createQuery("from automobile");
		
		Iterator<Automobile> iter=  query.iterate();
		while ( iter.hasNext()) {
			Automobile auto = iter.next();
			checkhandle(auto);
			
			System.out.print("Visit" + auto.visit());
			System.out.println(auto.getAutofeature());
		
		}
		
	}
	
	
	public static void checkhandle (Automobile auto) {
		System.out.println("Automobile");
	}
	public static void checkhandle (Car auto) {
		System.out.println("Car");
	}
	
	public static void checkhandle (Maruti auto) {
	System.out.println("Maruti");
	}
}

