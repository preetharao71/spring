package fanpack;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Fan {
	public Fan() {
		System.out.println("fans cons called.........");
	}
	FanState state;
	public FanState getState() {
		return state;
	}
	public void setState(FanState state) {
		this.state = state;
	}
	public void pull()
	{
		state.pull(this);
	}
}

abstract class FanState
{
	private FanState fanstate;
	public abstract void pull(Fan f);
	public FanState getFanstate() {
		return fanstate;
	}
	public void setFanstate(FanState fanstate) {
		this.fanstate = fanstate;
	}
}
class SwitchOnState extends FanState implements ApplicationContextAware
{
	private ApplicationContext appcontext;
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.appcontext=arg0;
		
	}
	public SwitchOnState() {
		System.out.println("switch on state cons called...");
	}
	@Override
	public void pull(Fan f) {
		//ApplicationContext ctx=new FileSystemXmlApplicationContext("paint-config.xml");
		f.state=appcontext .getBean("lss",LowSpeedState.class);
		System.out.println("Low Speed State..........");
	}
}
class LowSpeedState extends FanState {
public LowSpeedState() {
	System.out.println("low speed cons called.......");
}
	@Override
	public void pull(Fan f) {
		f.state=getFanstate();
		System.out.println("Medium speed state.......");
	}
}
class MediumSpeedState extends FanState
{
	public MediumSpeedState() {
		System.out.println("medium speed cons called....");
	}
@Override
	public void pull(Fan f) {
		f.state=getFanstate();
		System.out.println("Switchoff state........");
	}	
}
class SwitchOffState extends FanState
{
	public SwitchOffState() {
		System.out.println("switch off conscalled.........");
	}
	@Override
	public void pull(Fan f) {
		f.state=getFanstate();
		System.out.println("switch on state.......");
	}
}