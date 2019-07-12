package vanilapack;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class IceCream {
	private String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setup()
	{
		System.out.println("Setup method called......................");
	}
	private Vanila vanila;
	private List<String> alist;
	private Map<String, Object> amap;
	private Properties prop;
	private Set<Object> aset;
	
	public List<String> getAlist() {
		return alist;
	}
	public void setAlist(List<String> alist) {
		this.alist = alist;
	}
	public Map<String, Object> getAmap() {
		return amap;
	}
	public void setAmap(Map<String, Object> amap) {
		this.amap = amap;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Set<Object> getAset() {
		return aset;
	}
	public void setAset(Set<Object> aset) {
		this.aset = aset;
	}
	public Vanila getVanila() {
		return vanila;
	}
	public void setVanila(Vanila vanila) {
		this.vanila = vanila;
	}
	public IceCream() {
		// TODO Auto-generated constructor stub
	}
	public IceCream(Vanila cream) {//constructor injection
		System.out.println("icecream cons called....No Flavour...");
		this.vanila=cream;
		System.out.println(cream.getName());
	}
//	public IceCream(Vanila cream,String flavour) {//constructor injection
//		System.out.println("icecream cons called...."+flavour);
//		System.out.println(cream.getName());
//	}
//	public IceCream(Integer prize,String name){
//		System.out.println("The prize is:"+prize);
//		System.out.println("The Name is:"+name);
//	}
//	public IceCream(String prize,String name)
//	{
//		System.out.println("The String prize is..:"+prize);
//		System.out.println("The String name is..:"+name);
//	}
	
	public void flavour()
	{
		System.out.println(vanila.getName());
	}
}
class Vanila
{
	private String code;
	private String name; //setter injection
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}