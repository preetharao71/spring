package pojopack;

import java.io.Serializable;
import java.lang.String;
import java.math.BigDecimal;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Students
 *
 */
@Entity(name="jpastud")
@Table(name="STUDENT_TABLE")

public class Students implements Serializable {

	
	private String studentName;   
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int studentID;
	private String studentAddress;
	private BigDecimal amount;
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	private static final long serialVersionUID = 1L;

	private int age;
	public final String getStudentName() {
		return studentName;
	}
	public final void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public final int getStudentID() {
		return studentID;
	}
	public final void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public final String getStudentAddress() {
		return studentAddress;
	}
	public final void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public final int getAge() {
		return age;
	}
	public final void setAge(int age) {
		this.age = age;
	}
	public final String getCourseName() {
		return courseName;
	}
	public final void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public static final long getSerialversionuid() {
		return serialVersionUID;
	}

	private String courseName;
	
	public Students() {
		super();
	}   
	public String getstudentName() {
		return this.studentName;
	}

	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}   
	public int getstudentID() {
		return this.studentID;
	}

	public void setstudentID(int studentID) {
		this.studentID = studentID;
	}   
	public String getstudentAddress() {
		return this.studentAddress;
	}

	public void setstudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
   
	@Override
	public String toString() {
		
		return studentID +"-" + studentName + courseName;
		
	}
	
	public void credit(BigDecimal amount) {
		this.amount.add(amount);
	}
	public void debit(BigDecimal amount) {
		this.amount.subtract(amount);
	}
}
