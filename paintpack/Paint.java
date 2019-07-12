package paintpack;

public abstract class Paint {
	public abstract void doStick();
}
class RedPaint extends Paint
{
	public RedPaint() {
		System.out.println("red paint cons called.........");
	}
@Override
	public void doStick() {
		System.out.println("red colour sticks.........");
	}	
}
class BluePaint extends Paint
{
	public BluePaint() {
		System.out.println("blue paint cons called.........");
	}
	@Override
	public void doStick() {
		System.out.println("blue paint sticks.........");
		
	}
}