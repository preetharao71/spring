package springjdbc;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jdbcclient {
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("intropack2/config.xml");
		DataSource ds=(DataSource)ctx.getBean("myDataSource");
		System.out.println(ds.getConnection());
	}
}
