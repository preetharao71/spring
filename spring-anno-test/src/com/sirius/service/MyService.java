package com.sirius.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirius.comp.MyComponent;

@Service("myservice")
public class MyService {
	@Autowired
	private MyComponent mycom;
	
	public MyService() {
		System.out.println("service object created....");
		
	}
	public void myServiceMethod() {
		System.out.println(mycom.sayHello());
	}
	public MyComponent getMycom() {
		return mycom;
	}
	public void setMycom(MyComponent mycom) {
		this.mycom = mycom;
	}
}
