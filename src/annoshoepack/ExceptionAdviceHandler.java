package annoshoepack;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdviceHandler implements ThrowsAdvice{
	public void afterThrowing(ShoeException se){
		System.out.println("contain the logic for exception handling....");
	}
	public void afterThrowing(ShoeException2 se){
		System.out.println("contain the logic for exception handling 22222");
	}
	
}
