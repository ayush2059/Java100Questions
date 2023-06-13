//Print prime no Program in java

package codingpract;

import java.util.Scanner;

class PrimeNo
{
	int a;
	int count=1;
	Scanner s=new Scanner(System.in);
	public void menu()
	{
      System.out.println("enter the no to check prime");
      a=s.nextInt();
      for(int i=2;i<=a-1;i++)
      {
    	  if(a%i==0)
    	  {
    		  count++;
    		  break;
    	  }
      }
      if(count==2)
      {
    	  System.out.println("not prime no");
      }
      else if(count==1)
      {
    	  System.out.println("prime no");
      }
	}
	
	
}
public class A26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNo pn=new PrimeNo();
		pn.menu();

	}

}
