//How to Generate random number in java Program
//Random no class provideed by java //// random integers in [0, 100]
package codingpract;
import java.util.Random;
import java.util.Scanner;
class Random_no
{    int n;
	public void show(int a)
	{
		this.n=a;
		Random rm=new Random();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" "+rm.nextInt(90));
		}}}
public class A56 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		Random_no rno=new Random_no();
		rno.show(a);
}}
