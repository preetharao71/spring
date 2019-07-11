
package multiinhertpack;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="automobile")
//@Table(name="auto")

@Inheritance(strategy = InheritanceType.JOINED)

public class Automobile implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	public int sno;
	//private String DISC;
	public Automobile() {
		sno=(int) System.nanoTime();
	}
	public final int getSno() {
		return sno;
	}
	public final void setSno(int sno) {
		this.sno = sno;
	}
	public final String getAutofeature() {
		return autofeature;
	}
	public final void setAutofeature(String autofeature) {
		this.autofeature = autofeature;
	}
	public String autofeature;
	
	public String toString() {
		return "Auto " + super.toString();
	}
//	public String getDISC() {
//		return DISC;
//	}
//	public void setDISC(String dISC) {
//		DISC = dISC;
//	}
//	
	
	public InnerHandler visit() {
		return  new InnerHandler().handle(this);
	}
}
