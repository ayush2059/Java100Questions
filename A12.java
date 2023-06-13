//Nested If Else clause in java

package codingpract;
class Nife
{
	int Pass_Mark=40,a;
	public void lol(int a)
	{
		this.a=a;
		if(a>=Pass_Mark)
		{
			if(a>=90)
			{
				System.out.println("A grade");
			}
			else if(a>75)
			{
				System.out.println("B grade");
			}
			
			else if(a>=60)
			{
				System.out.println("C grade");
			}
			else
			{
				System.out.println("D grade");
			}
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
public class A12 {

	public static void main(String[] args) {
		Nife nl=new Nife();
		nl.lol(3);
		

	}

}
