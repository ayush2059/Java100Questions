package codingpract;
import java.util.Scanner;
class methodl
{
	int a1;
	int b1;
	public static int a(int l,int b)
	{
		return l*b;	
	}
	public void b(int c,int h)
	{
		this.a1=c;
		this.b1=h;
		System.out.println(c+h);
	}
}
public class StaticandNon {

	public static void main(String[] args) {
		System.out.println("enter the length and breadth");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter the height");
		int h=sc.nextInt();
		int c=methodl.a(l,b);
		methodl ol=new methodl();
		ol.b(c,h);
		
	}

}
