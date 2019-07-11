package associationpack;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Employee {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	
	public void setEname(String ename) {
		this.ename = ename;
	}

	
	public Set<Address> getAddressid() {
		return address;
	}

	public void setAddressid(Set<Address> addressid) {
		this.address = addressid;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int i) {
		this.sal = i;
	}

	private String ename;
	
	@OneToMany(cascade= {CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinTable(name="Employee_has_Address")
	private Set<Address> address;
	
	private int sal;

	
	 @ManyToMany(cascade= {CascadeType.ALL} , fetch=FetchType.EAGER)
	 @JoinTable(name ="Employee_has_Training" )
	  private Set<Training> training;
	  
	  public Set<Training> getTraining() { return training; }
	  
	  public void setTraining(Set<Training> training) { this.training = training; }
	 
}
