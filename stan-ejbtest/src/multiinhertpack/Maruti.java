package multiinhertpack;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Maruti")
//@Table(name="maruti")

//@DiscriminatorColumn(name="DISC")
//@DiscriminatorValue(value="maruti")

public class Maruti extends Car implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@Id
	int carno;
	
	public final int getCarno() {
		return carno;
	}
	public final void setCarno(int carno) {
		this.carno = carno;
	}
	public final String getColor() {
		return color;
	}
	public final void setColor(String color) {
		this.color = color;
	}
	public final String getMake() {
		return make;
	}
	public final void setMake(String make) {
		this.make = make;
	}
	String color;
	String make;
	
	public String toString() {
		return "Maruti " + super.toString();
	}
	

}
