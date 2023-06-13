//Print reverse string in java Program

package codingpract;
class reverse
{
	String x;
	StringBuilder y;
	int k;
	StringBuilder sb=new StringBuilder();  
	public void a(String a)
	{
		this.x=a;
		StringBuilder sb=new StringBuilder();
		sb.append(x);
		y=sb.reverse();
		System.out.println(y);
	}
	public void b(String a, String b)
	{
		x=a+b;
		k=x.length();
		for(int i=k-1;i>=0;i--)
		{
			System.out.print(x.charAt(i));
		}
		
	}

}
public class A30 {

	public static void main(String[] args) {
		reverse ser=new reverse();
		ser.a("india");
       ser.b("Ayush","Raj");
	}

}
