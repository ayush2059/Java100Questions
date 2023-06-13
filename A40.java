//How to remove space in string both end in java Program

package codingpract;
class trim
{
	String a;
	public void show(String x)
	{
		this.a=x;
		System.out.println("original \n"+ a);
		System.out.println(a+"ok");
		System.out.println(a.trim()+" "+"ok");
	}
}
public class A40 {

	public static void main(String[] args) {
		
		trim im=new trim();
		im.show(" Ayush Raj ");
		
			
	}
}
