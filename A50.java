//How to throw exception in java Program

package codingpract;
import java.util.Scanner;
class Votingexception extends Exception
{
	Votingexception(String s)
	{
		super(s);
	}
	public String to_String()
	{
		return "Not able to vote";
		
	}
}
public class A50 {
	
	public static void main(String[] args)  {
		
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("enter a number");
			int a=s.nextInt();
		if(a<18)
		{
			throw new Votingexception("Below age, he doesn't has right to vote");
		}
		else
		{
			System.out.println("able to vote");
		}
		}
		catch(Votingexception e)
		{
			System.out.println(e.getMessage());
		}
		
			


}}
