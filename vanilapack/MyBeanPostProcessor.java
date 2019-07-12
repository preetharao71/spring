package vanilapack;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("post process after initialization.................."+arg1);
		try{
		Field f=arg0.getClass().getDeclaredField("code");
		f.setAccessible(true);
		f.set(arg0,"23232323asfsdfff");
		}catch(Exception e){}
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("post process before initialization.................."+arg1);
		return arg0;
	}

}
