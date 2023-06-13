//Find factorial for given no Program in Java
package codingpract;

import java.util.Scanner;

public class A14 {

	public static void main(String[] args) {
		Scanner K1=new Scanner(System.in);
		int fact=1;
		System.out.println("enter the number");
		int x=K1.nextInt();
		if(x>0)
		{
			for(int i=x;i>=1;i--)
			{
				fact=fact*i;
			}
			System.out.println(fact);

		}
		else
		{
			System.out.println("fact cannot find for negative number");
			
		}
	}

}
