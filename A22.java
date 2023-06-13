//using break and continue Program in java

package codingpract;

import java.util.Scanner;

class WhileBreak2
{
	int n;
	Scanner s=new Scanner(System.in);
	public void main()
	{
		while(true)
		{
			System.out.println("enter a number");
			n=s.nextInt();
			if(n!=0)
			{
				System.out.println("Entered Number"+" "+n);
				continue;
			}
			else
			{
				break;
			}
		}
	}
}
public class A22 {

	public static void main(String[] args) {
	WhileBreak2 w2=new WhileBreak2();
	w2.main();
		
			
	}
}
