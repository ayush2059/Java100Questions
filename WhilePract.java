package codingpract;

import java.util.Scanner;

class WhileString
{
	String a;
	public void main()
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter the name");
			a=sc.nextLine();
			System.out.println(a);
			if(a.equalsIgnoreCase("Error"))
			{
				System.out.println(a+""+"Found");
				break;
			}
			else
			{
				System.out.println("Your entred name->"+" "+a);
				continue;
			}
			
		}
	}
}
public class WhilePract {

	public static void main(String[] args) {
		WhileString ws=new WhileString();
		ws.main();

	}

}
