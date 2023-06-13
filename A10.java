//If Else clause in java
package codingpract;
class Ifelse
{
	String x;
	public void ie(String a)
	{
		this.x=a;
		if(a=="Ayush")
		{
			System.out.println("Print--> Ayush");
		}
		else
		{
			System.out.println("No Name Found");
		}
	}
}
public class A10 {

	public static void main(String[] args) {
		Ifelse ix=new Ifelse();
		ix.ie("Raj");

	}

}
