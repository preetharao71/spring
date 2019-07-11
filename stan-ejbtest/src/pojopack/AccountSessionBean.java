package pojopack;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import multiinhertpack.Automobile;
import multiinhertpack.Car;
import multiinhertpack.Maruti;

@Stateless(name="account")
@TransactionManagement(javax.ejb.TransactionManagementType.CONTAINER)
@Remote(Account.class)
public class AccountSessionBean implements Account {
	@PersistenceContext
	private Session manager;
	//private EntityManager manager;
	
	//@Resource private SessionContext ctx;
	
	
	  public void createStudent( String studentname , String stuaddress , BigDecimal amount) {
	  Students s = new Students(); 
	  
	  s.setstudentName(studentname); 
	  s.setstudentAddress(stuaddress);
	  s.setAmount(amount);
	  manager.persist(s); 
	  
	  }
	 
	
	public void createVehicle() {
		Automobile auto = new Automobile();
		auto.setSno(100);
		auto.setAutofeature("basic automobile ");
		Car car = new Car();
			car.setSno(300);
			car.setModel("hatch back");
		Maruti maruti = new Maruti();
			maruti.setSno(300);
			maruti.setColor("sss");
	   manager.persist(auto);
	   manager.persist(car);
	   manager.persist(maruti);
		
	}
	
	@Override
	public void readPolyQuery() {
		org.hibernate.Query query = (org.hibernate.Query) manager.createQuery("from automobile");
		
		Iterator<Automobile> iter=  query.iterate();
		while ( iter.hasNext()) {
			
			
			Automobile auto = iter.next();
			System.out.print(auto.visit());
			System.out.println(auto.getAutofeature());
			
			
			/*
			 * if ( obj instanceof Automobile ) { Automobile auto = (Automobile) obj;
			 * System.out.print("Auto" + auto.getAutofeature() ); } else if ( obj instanceof
			 * Car ) { Automobile auto = (Automobile) obj; System.out.print("Car" +
			 * auto.getAutofeature() ); } else if ( obj instanceof Maruti ) { Maruti auto =
			 * (Maruti) obj; System.out.print("Maruti" + auto.getAutofeature() ); }
			 */
		}
		
	}
	
	public Session getManager() {
		return manager;
	}


	public void setManager(Session manager) {
		this.manager = manager;
	}
}
