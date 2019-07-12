package shoepack;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class WelcomeAdvice implements MethodBeforeAdvice{
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		Customer customer=(Customer)arg1[0];
		String name=customer.getName();
		System.out.println("Welcome to my shoe shop..:"+name);		
	}
}
