//Print Reverse number in java program
package codingpract;

import java.util.Scanner;

class Twen
{
	int a,r;
	public void show(int a)
	{
		this.a=a;
		while(a>0)
		{
		    r=a%10;
			System.out.print(r);
			a=a/10;
		}
	}
}
public class A20 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		Twen tn=new Twen();
		tn.show(a);
		}
	}


