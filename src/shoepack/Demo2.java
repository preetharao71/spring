package shoepack;

public class Demo2 {
	public static void main(String[] args) {
		Messageable hello = Message::new;
		//hello.getMessage("Hello");
	}
}
interface Messageable{
	Message getMessage(String msg);
}
class Message{
	Message(String msg){
		System.out.println("cons called...");
		System.out.print(msg);
	}
}
