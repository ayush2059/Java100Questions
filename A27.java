//Check no is Armstrong or not in java Program
package codingpract;

import java.util.Scanner;

class Armstrongno
{
	int x,r;
	int temp;
	int sum=0;
	public void main(int a)
	{
		this.x=a;
		temp=x;
		System.out.println(temp+" "+"temp");
		while(x>0)
		{
			r=x%10;
			sum=sum+(r*r*r);
			x=x/10;
			
		}System.out.println(sum+" "+"sum");
		
		if(temp==sum)
		{
			System.out.println("Armstrong no");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
public class A27 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no");
		int a=s.nextInt();
		Armstrongno ano=new Armstrongno();
		ano.main(a);
	
	}

}
