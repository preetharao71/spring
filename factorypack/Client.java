package factorypack;

public class Client {
public static void main(String[] args) {
	FrameworkService fws=new FrameworkService();
	ShoeShop shop=(ShoeShop)fws.getService("shop");
	ShoeFactory factory=(ShoeFactory)fws.getService("bsf");
	
	shop.setFactory(factory);
	
	System.out.println(shop.sellShoe(new Cust()));
}
}
