package intropack;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class PaintCarMixing extends DelegatingIntroductionInterceptor implements PaintColour{
	private String colour;
@Override
public String getColour() {
	// TODO Auto-generated method stub
	return colour;
}
@Override
	public void setColour(String colour) {
		// TODO Auto-generated method stub
		this.colour=colour;
	}
}
