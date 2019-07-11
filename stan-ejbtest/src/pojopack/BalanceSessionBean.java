package pojopack;

import java.math.BigDecimal;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name="balance")
@Remote(Balance.class)
@TransactionManagement(javax.ejb.TransactionManagementType.CONTAINER)
public class BalanceSessionBean implements Balance{
	
	@PersistenceContext
	public EntityManager manager;
	
	@Override
	@TransactionAttribute(javax.ejb.TransactionAttributeType.REQUIRED)
	public void moveAmount ( int fromstudentid , int tostudentid , BigDecimal amount ) {
		
		Students fromstu = manager.find(Students.class, fromstudentid);
		Students tostu = manager.find(Students.class, tostudentid);
		
		System.out.print("FROM BALANCE"+ fromstu.getAmount() );
		fromstu.debit(amount);
		tostu.credit(amount);
		manager.persist(fromstu);
		manager.persist(tostu);
		
		
	}

	@Override
	public  Students fundStudent(String studentId, BigDecimal amount) {
		// TODO Auto-generated method stub
		Students newStudent = new Students();
		newStudent.setStudentID(999);
		newStudent.setCourseName("EJB");
		newStudent.setAmount(new BigDecimal(1000));
		return newStudent;
	}

}
