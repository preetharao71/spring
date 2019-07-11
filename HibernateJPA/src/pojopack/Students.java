package pojopack;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Entity implementation class for Entity: Students
 *
 */
@Entity(name="jpastud")
@Table(name="STUDENT_TABLE")
//@Cacheable
//@org.hibernate.annotations.Cache( usage = CacheConcurrencyStrategy.READ_WRITE )
public class Students implements Serializable {

	
	private String studentName;   
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int studentID;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	private String studentAddress;
	private static final long serialVersionUID = 1L;

	private int age;
	
	
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
}
