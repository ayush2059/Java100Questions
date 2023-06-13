//If Else clause in java- Program 2
package codingpract;

import java.util.Scanner;

class Passing
{
	int passingmark=40;
	int a;
	public void paie(int a)
	{
		this.a=a;
		if(a>=passingmark)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}
public class A11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int a=s.nextInt();
		Passing p=new Passing();
		p.paie(a);
		

	}

}
