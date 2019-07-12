package paintpack;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PaintBrush{ //implements ApplicationContextAware{
//	private ApplicationContext ctx;
//	@Override
//	public void setApplicationContext(ApplicationContext arg0)
//			throws BeansException {
//		this.ctx=arg0;
//		
//	}
	public PaintBrush() {
		System.out.println("paint brush cons called.........");
	}
	private Paint paint;

	public Paint getPaint() {
		return paint;
	}
	public void setPaint(Paint p)
	{
		this.paint=p;
	}
//	public void setPaint() {
//		this.paint = ctx.getBean("paint",Paint.class);
//	}
//	
//	public void paint()
//	{
//		setPaint();
//		getPaint().doStick();
//	}
}
