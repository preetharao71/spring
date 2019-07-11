package multiinhertpack;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Car")
//@Table(name="car")

//@DiscriminatorColumn(name="DISC")
//@DiscriminatorValue(value="car")
public class Car extends Automobile  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@Id
	public int regno;
	
	public final int getRegno() {
		return regno;
	}

	public final void setRegno(int regno) {
		this.regno = regno;
	}

	public final String getModel() {
		return model;
	}

	public final void setModel(String model) {
		this.model = model;
	}

	public String model;
	
	public String toString() {
		return "Car " + super.toString();
	}
	
	
	
	
}
