package intropack2;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class Human {
@Override
public String toString() {
	return "I am just shoiab.....";
}
}

interface Doctor
{
	public void doCure();
}
class DoctorImpl extends DelegatingIntroductionInterceptor implements Doctor
{
@Override
	public void doCure() {
		System.out.println("I am doing medicine practice............");
	}	
}