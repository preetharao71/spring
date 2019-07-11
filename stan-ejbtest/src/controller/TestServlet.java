package controller;

import java.io.IOException;
import java.math.BigDecimal;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojopack.Account;
import pojopack.Balance;


public class TestServlet  extends HttpServlet{

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		
		Context ctx = new InitialContext();
		Account student =(Account) ctx.lookup("account");
		student.createStudent( "ejb-student2", "jboss",new BigDecimal(10000));
		student.createStudent( "ejb-student5", "jboss234",new BigDecimal(0));
		
		Balance bal = (Balance) ctx.lookup("balance");
		bal.moveAmount(1,2, new BigDecimal(5000));
		
		//student.createVehicle();
		
		student.readPolyQuery();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
