package com.sirius.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
}
