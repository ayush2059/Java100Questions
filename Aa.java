//Print Integer in java
package codingpract;

class Integer
{
	private int a1;

	public void print(int a)
	{
		 this.a1=a;
		 for(int i=1;i<=a1;i++)
		 {
			 System.out.println(i);
		 }
		
	}
}
public class Aa {

	public static void main(String[] args) {
		
     Integer i=new Integer();
     i.print(10);
	}

}
