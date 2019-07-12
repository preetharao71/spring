package shoepack;

public class ShoeException extends Exception{
	String msg;
public ShoeException(String msg) {
	// TODO Auto-generated constructor stub
	this.msg=msg;
}
public String toString() {
	return "Exception..:"+msg;
}
}
