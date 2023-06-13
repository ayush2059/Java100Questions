//Print Star console using Loop
package codingpract;
class Starlims
{
	int a,i,j;
	public void show(int a)
	{
		this.a=a;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println();
		}
	}
}
public class A18 {

	public static void main(String[] args) {
		Starlims ls=new Starlims();
		ls.show(10);
	}

}
