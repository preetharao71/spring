package student.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import associationpack.Address;
import associationpack.Employee;
import associationpack.Training;

public class TestEmployeeAssociation {

	public static void main(String args[]) {
		
		Session em = EmUtility.getSessionManager();
		System.out.println("Thread id=======1 : "+ em);
		createEmployee(em);
		
	}
	
	public static void createEmployee( Session em) {
		
		Transaction transaction = em.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEid(100);
		emp.setEname("swetha");
		emp.setSal(1000);
		
		Address add = new Address();
		add.setAid(001);
		add.setStreet("Majestivc");
		add.setEmp(emp);
		

		Address add2 = new Address();
		add2.setAid(002);
		add2.setStreet("Arumuga naval");
		add2.setEmp(emp);
		
		Set<Address> addressset = new HashSet<Address>();
		
		addressset.add(add);
		addressset.add(add2);
		
		emp.setAddressid(addressset);
		
		Training train1 = new Training();
		//train1.setTid("JP001");
		train1.setCoursename("JPA");
		//train1.setEmp(emp);
		em.save(emp);
		//em.save(add);
		//em.save(add2);
		
		transaction.commit();
		
		
		
		
		
	}
	
}
