package student.client;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import associationpack.Address;
import associationpack.Employee;

public class ReadClient {
	
	public static void main(String args[]) {
		
		org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration().configure("hibernate.anno.cfg.xml");
		SessionFactory emf = cfg.buildSessionFactory();
		Session session =	emf.openSession();
		
		Query query = session.createQuery("from Employee");
		
		Iterator<Employee> emp = query.iterate();
		
	
		
		while ( emp.hasNext() ) {
			Employee empdata =(Employee) emp.next();
			System.out.print("List" + empdata.getEname() );
			Set<Address> address = empdata.getAddressid();
			
			while (address.iterator().hasNext()) {
				
				System.out.print("List" + empdata.getAddressid().toString());
			}
		}
			
		
	}

}
