package codingpract;

import java.util.Scanner;

class  Add
{
	int res;
	int a1;
	int a2;
	String word;
	public void add(int a,int b, String c)
	{
		this.a1=a;
		this.a1=b;
		this.word=c;
		res=a+b;
		System.out.println(res+" "+c);
	}
}
public class Aaaaa {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first no");
		int a=s.nextInt();
		System.out.println("enter second no");
		int b=s.nextInt();
		System.out.println("enter word");
		s.nextLine();
		String c=s.nextLine();
		Add ro=new Add();
		ro.add(a, b, c);

	}

}
