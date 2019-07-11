package multiinhertpack;

public class InnerHandler {
	
	public InnerHandler handle(Automobile auto) {
		System.out.println("auto feature"+ auto.autofeature);
		return this;
	}
	
	public InnerHandler handle(Car car) {
		System.out.println("car feature"+ car.autofeature);
		return this;
	}

	public InnerHandler handle(Maruti car) {
		System.out.println("maruti feature"+ car.autofeature);
		return this;
	}
}
