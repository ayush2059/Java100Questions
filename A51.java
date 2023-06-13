//Advantage of Finally in Exception Handling java Program
package codingpract;
import java.util.Scanner;

class Ecxcepok
{
	int a,b;
	Scanner s=new Scanner(System.in);
	public void show()
	{
		try {
		System.out.println("enter two number");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Ans:-"+" "+(a+b));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally always execute");
		}
	}
}
public class A51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecxcepok po=new Ecxcepok();
		po.show();
		

	}

}
