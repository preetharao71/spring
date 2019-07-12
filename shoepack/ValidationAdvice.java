package shoepack;

import java.util.HashSet;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ValidationAdvice implements MethodInterceptor{//around advice....
	HashSet<Customer> customerset=new HashSet<Customer>();
@Override
public Object invoke(MethodInvocation invocation) throws Throwable {
	// TODO Auto-generated method stub
	//here goes our custom cod....
	Customer customer=(Customer)invocation.getArguments()[0];
	if(customerset.contains(customer)){
		throw new ShoeException("Only one per customer......");
	}
	Shoe shoe=(Shoe)invocation.proceed();
	customerset.add(customer);
	return shoe;
}
}
