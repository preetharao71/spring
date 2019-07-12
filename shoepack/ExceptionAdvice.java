package shoepack;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvice implements ThrowsAdvice{
	public void afterThrowing(ShoeException se)
	{
		System.out.println("Exception advice called...........");
	}
}
