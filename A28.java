//Print Floyd’s Triangle in java Program

package codingpract;
import java.util.Scanner;
class Floyflag
{
	int a;
	int k=1;
	public void main(int a)
	{
		this.a=a;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}System.out.println();
		}
		
	}
}
public class A28 {

	public static void main(String[] args) {
		System.out.println("enter the now of row of floyflag");
		Scanner sx=new Scanner(System.in);
		int a=sx.nextInt();
		Floyflag fg=new Floyflag();
		fg.main(a);
		
		
}}