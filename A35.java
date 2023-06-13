//How to compare 2 string in java Program

package codingpract;

class Str
{
	String x,y,z,k;
	String a1,b2,c2,d2;
	public void show(String a,String b,String c,String d)
	{
		this.x=a;
		this.y=b;
		this.z=c;
		this.k=d;
		
		result(x,y,z,k);
	}
	public void result(String a,String b,String c,String d) 
	{
		this.a1=a;
		this.b2=b;
		this.c2=c;
		this.d2=d;
		System.out.println(a1.compareTo(b2));
		System.out.println(c2.compareTo(d2));
		System.out.println(a1.compareToIgnoreCase(d2));
	}
	
}
public class A35 {

	public static void main(String[] args) {
		System.out.println("ayush");
		Str sr=new Str();
		sr.show("Ayush", "Ayush", "Aman", "ayush");

	}

}
