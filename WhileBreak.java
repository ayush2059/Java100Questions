package codingpract;

import java.util.Scanner;

class Break
{
	int n;
	public void main()
	{
	Scanner s=new Scanner(System.in);
	while(true)
	{
		System.out.println("enter a number");
		n=s.nextInt();
		if(n==0)
		{
			break;
		}
		System.out.println("you entered no"+ n);
	}
	}
}
public class WhileBreak {

	public static void main(String[] args) {
		Break bk=new Break();
		bk.main();

	}

}
