package intropack;

	import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

	public class Client{

	    public static void main(String rgs[]){
	        ApplicationContext ctx = new FileSystemXmlApplicationContext("config.xml");
	               

	        Car car = (Car)ctx.getBean("car");
	        
	        PaintColour carColor = (PaintColour) car;

	        // test interfaces
	     //   System.out.println("Is car?:"+car instanceof Car);
	        
	       // System.out.println("Is PaintColor?&#58; " + &#40;car instanceof PaintColor&#41;&#41;;

	        // test is modified implementation
	        carColor.setColour("orange");
	        System.out.println("Get color " + carColor.getColour());
	       // carColor.setColor("Blue"&#41;;
	       // System.out.println("Get color&#58; " + carColor.getColor&#40;&#41;&#41;;
	       // carColor.setColor("Red"&#41;;
	       // System.out.println("Get color&#58; " + carColor.getColor&#40;&#41;&#41;;
	    //&#125;
	        
	    }
}
