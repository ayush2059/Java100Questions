//Check Given No is palindrome or Not in java Program

package codingpract;

import java.util.Scanner;

class Pal
{
	int l,r,temp,rn=0;
	String x;
	int z;
	String ok="";	
	public void main(int a)
	{
		this.l=a;
		while(l>0)
		{
			r=l%10;
			rn=rn*10+r;
			l=l/10;
		}
		System.out.println(rn);
		if(rn==temp)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("palindrome number");
		}
		
	}
	public void s(String a)
	{
		this.x=a;
		z=x.length();
		for(int i=z-1;i>=0;i--)
		{
			ok=ok+x.charAt(i);
		}
		System.out.println(ok);
		if(x.equals(ok))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("dont");
		}
	}
	
}
public class A31 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int a=s.nextInt();
		Pal pl =new Pal();
		pl.main(a);
	
        pl.s("aba");
	}

}
