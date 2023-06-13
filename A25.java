//Print Multiplication table Program in java

package codingpract;
import java.util.Scanner;

class Multxxx
{
	Scanner s=new Scanner(System.in);
	int a,b;
	public void show()
	{
		System.out.println("enter a range to print table");
		a=s.nextInt();
		b=s.nextInt();
		for(int i=a;i<=b;i++)
		{
			System.out.println("Table of "+i);
			
			for(int j=1;j<=10;j++)
			{
				System.out.println(i*j);
			}
		}
	}
	public void main2()
	{
		System.out.println("enter no to print");
		int a=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a*i);
		}
	}
}


public class A25 {

	public static void main(String[] args) {
		
		Multxxx xx=new Multxxx();
		xx.show();
		xx.main2();

	}

}
