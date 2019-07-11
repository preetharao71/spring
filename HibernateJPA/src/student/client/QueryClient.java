package student.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import associationpack.Employee;
import pojopack.Students;

public class QueryClient {
	
	public static void main(String args[]) {
		
		org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration().configure("hibernate.anno.cfg.xml");
		SessionFactory emf = cfg.buildSessionFactory();
		Session em = emf.openSession();
		
		querytable(em);
		querytablecol(em);
		 
		
		
		
		
	}
	
	public static void querytable(Session em ) {
		//Transaction trn = em.beginTransaction();
	Query query = em.createQuery("from jpastud") ;
				
		Iterator<Students> stuqry = query.iterate();
		System.out.println("Query Table1 " );
		while ( stuqry.hasNext()) {
			
			Students s  = (Students )stuqry.next();
			System.out.println("Query Table " + s.getStudentID());
			
		}
		
		Criteria crite = em.createCriteria(Students.class);
		crite.add(Property.forName("age").lt(10));
		Iterator<Students> s = crite.list().iterator();
		while( s.hasNext() ) {
			System.out.println("Less than 10 " + s.next());
		}
	}
	public static void querytablecol(Session em ) {
			Transaction trn = em.beginTransaction();
			Query query = em.createQuery("select st.studentID from jpastud st ");
			Iterator<Students> stuqry = query.iterate();
			while ( stuqry.hasNext()) {
				
				
				System.out.println("Query Table columns" + stuqry.next());
				
			}
	}	
		
		
		public static void query6(Session em ) {
		
			Criteria crite = em.createCriteria(Students.class);
			crite.add(Restrictions.like("studentName", "S%").ignoreCase())
						.add(Restrictions.gt("age", new Float(100)));
			
		}
			
			
		public static void query7(Session em ) {
			
			Criteria crite = em.createCriteria(Students.class);
			crite.add(Restrictions.or(Restrictions.like("studentName", "S%").ignoreCase(),
						Restrictions.gt("age", new Float(100))));
			
		}
			
		public void query13(Session em )
		{
			Query query=em.createQuery
				("select e.emp_name, e.salary from Employee e,Address a where a.city=:c");
			query.setParameter("c", "cochin");
			Iterator<Object[]> obj=query.iterate();
			while(obj.hasNext())
			{
				Object o[]=obj.next();
				System.out.println(o[0]+":"+o[1]);
			}
		}
		
		
		public void query8(Session em)
		{
			Criteria criteria = em.createCriteria(Employee.class);
			DetachedCriteria dc=DetachedCriteria.forClass(Employee.class);
			dc.add(
					Restrictions.or(Restrictions.like("ename", "R%"),
					Restrictions.gt("esal", new Float(1000)))
				);
			criteria=dc.getExecutableCriteria(em);
			display(criteria);
		}
		
		public static void display(Criteria criteria)
		{
			List<Employee> employees=criteria.list();
			Iterator<Employee> iter=employees.iterator();
			while(iter.hasNext())
			{
				System.out.println(iter.next().getEname());
			}
		}
		public void query12(Session session)
		{
			Query query=session.createQuery("select e.ename from Employee e");
			Iterator<String> obj=query.iterate();
			while(obj.hasNext())
			{
				String s=obj.next();
				System.out.println(s);
			}
		}
		
		public void query14(Session session)
		{	//This query returns any employee that share a city with a address: - theta join 
			Query query=session.createQuery("select e from Employee e,Address a where a.city=:c");
			query.setParameter("c", "chennai");
			displayHql(query.list());
		}
		
		public static void displayHql(List<Employee> list)
		{
			Iterator<Employee> iter=list.iterator();
			while(iter.hasNext())
			{
				System.out.println(iter.next().getEname());
			}
		}
}
