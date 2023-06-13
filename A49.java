//Exception Handling java Program
package codingpract;
import java.util.InputMismatchException;
import java.util.Scanner;
class Except
{   int x,y,res;
	Scanner sr=new Scanner(System.in);
	public void show(){
		try {
			System.out.println("enter the two number");
			x=sr.nextInt();
			y=sr.nextInt();
			res=x+y;
			System.out.println(res);}
		catch(InputMismatchException e)
		{
			System.out.println("enter no only");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ok");
		}
		catch(Exception e){
			System.out.println("error exception");
			}	
		}}
public class A49 {
	public static void main(String[] args) {
		Except ext=new Except();
		ext.show();

	}

}
