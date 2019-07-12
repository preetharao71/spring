package shoepack;

public class ShoeException extends Exception {
	String msg;
public ShoeException(String msg) {
	// TODO Auto-generated constructor stub
	this.msg=msg;
}
@Override
public String toString() {
	return "The Exception is...:"+msg;
}
}
