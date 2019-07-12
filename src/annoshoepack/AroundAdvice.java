package annoshoepack;

import java.util.Vector;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{
	Vector<Customer> v=new Vector<Customer>();
@Override
public Object invoke(MethodInvocation arg0) throws Throwable {
	// TODO Auto-generated method stub
	Customer customer=(Customer)arg0.getArguments()[0];
	if(v.contains(customer)){
		throw new ShoeException("only one shoe per customer....");
	}
	else{
		v.add(customer);
		return arg0.proceed();
	}
	
}
}
