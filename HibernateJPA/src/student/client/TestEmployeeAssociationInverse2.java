package student.client;

import org.hibernate.Session;
import org.hibernate.Transaction;


import associationpack.Employee;
import pojopack.Students;

public class TestEmployeeAssociationInverse2 {

	public static void main(String args[]) {
		
		Session em = EmUtility.getSessionManager();
		System.out.println("Thread id=======1 : "+ em);
	//	createEmployee(em);
		createStudent(em);
		
	}
	
	public static void createStudent( Session em) {
		
		Transaction transaction = em.beginTransaction();
		Students at  = new Students();
		//at.setstudentID(100);
		at.setCourseName("NewCoun");
		at.setstudentAddress("Address1");
		at.setStudentName("Name1");
		at.setAge(100);
		
		Students at1  = new Students();
		//at1.setstudentID(1);
		at1.setCourseName("NewCoun");
		at1.setstudentAddress("Address1");
		at1.setStudentName("studentName4");
		at1.setAge(1);
		
		em.save(at);
		em.save(at1);
		
		transaction.commit();
		
	}
	
	public static void createEmployee( Session em) {
		
		Transaction transaction = em.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEid(103);
		emp.setEname("Name103");
//		emp.setSal(1000);
//		
//		
////		Employee emp1 = new Employee();
////		emp1.setEid(203);
////		emp1.setEname("rupa203");
////		emp1.setSal(1000);
//		
////		Address add = new Address();
////		add.setAid(4343);
////		add.setStreet("Majestivc");
////		add.setEmp(emp);
////		
////
////		Address add2 = new Address();
////		add2.setAid(1121);
////		add2.setStreet("Arumuga naval");
////		add2.setEmp(emp);
////		
////		Set<Address> addressset = new HashSet<Address>();
////		
////		addressset.add(add);
////		addressset.add(add2);
//		
////		emp.setAddressid(addressset);
//		
//		
////		Set<Employee> empSet = new HashSet<Employee>();
////		//empSet.add(emp1);
////		empSet.add(emp);
//		
//		
//		Training train1 = new Training();
//		train1.setTid("HIB555");
//		train1.setCoursename("JPA");
//		//emp.setAddressid(addressid);
//		//train1.setEmp(empSet);
//		
//
//		 Training train2 = new Training(); 
//		 train2.setTid("HIB777");
//		 train2.setCoursename("Hibernate"); 
//		// train2.setEmp(empSet);
//		
//		
//		 Set<Training> trainset = new HashSet<Training>();
//		 trainset.add(train1);
//		 trainset.add(train2);
//		
//        emp.setTraining(trainset);
// //       train1.setEmp(empSet);
//		em.save(emp); // duplciate
//		
//		transaction.commit();
		
		
	}
	
}
