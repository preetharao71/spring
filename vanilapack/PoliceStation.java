package vanilapack;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PoliceStation {
	public void introspect(Object suspect)throws Exception
	{
		Class c=suspect.getClass();
		Field f=c.getField("publicname");
		System.out.println(f.get(suspect));
		Method m=c.getMethod("publicService", new Class[]{});
		m.invoke(suspect, new Object[]{});
	}
	public void tortureCell(Object suspect)throws Exception
	{
		Class c=suspect.getClass();
		Field f=c.getDeclaredField("secretname");f.setAccessible(true);
		System.out.println(f.get(suspect));
		Method m=c.getDeclaredMethod("secretService", new Class[]{});m.setAccessible(true);
		m.invoke(suspect, new Object[]{});
	}
	public static void main(String[] args)throws Exception {
		PoliceStation p1=new PoliceStation();
		p1.introspect(new Politician());
		p1.tortureCell(new Politician());
	}
}
