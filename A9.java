//Find Largest no in java Program
package codingpract;
class Greater
{
	int a,b,c;
	public void three(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		if(a>b && a>c)
		{
			System.out.println("A is Greater");
			
		}
		else if(b>a && b>c)
		{
			System.out.println("B is Greater");
			
		}
		if(c>a && c>b)
		{
			System.out.println("C is Greater");
			
		}
	}
}
public class A9 {

	public static void main(String[] args) {
		Greater gr=new Greater();
		gr.three(15, 30, 10);
	}

}
