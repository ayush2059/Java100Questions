package codingpract;

import java.util.Scanner;

class Stricall
{
	int str;
	Scanner sc=new Scanner(System.in);
	public void show()
	{
		System.out.println("enter the no of string u want to print");
		str=sc.nextInt();
		String[]arr=new String[str];
		for(int i=0;i<arr.length;i++)
		{
	
			arr[i]=sc.nextLine();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
}
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stricall sll=new Stricall();
		sll.show();

	}

}
