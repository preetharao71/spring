package shoepack;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class WelcomeAdvice implements MethodBeforeAdvice{
@Override
public void before(Method arg0, Object[] arg1, Object arg2)
		throws Throwable {
	// TODO Auto-generated method stub
	Customer customer=(Customer)arg1[0];
	System.out.println("Welcome to Our Shop...:"+customer.getName());
}
}
