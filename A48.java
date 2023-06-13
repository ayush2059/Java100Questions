//How to create constructor overloading in java Program
package codingpract;
class Getset
{
	String x;
	Getset()
	{
		System.out.println("java constructor");
	}
	Getset(String a)
	{
		System.out.println("Constructor over loading");
	}
	public void setMethod(String a)
	{
		this.x=a;
	}
	public String getMethod()
	{
		return x;
	}
}
public class A48 {
		
	public static void main(String[] args) {
		Getset gset=new Getset();
		Getset gset1=new Getset("Ayush");
		gset.setMethod("Aman Sharma");
		System.out.println(gset1.getMethod());		
		System.out.println(gset.getMethod());
	

	}}
