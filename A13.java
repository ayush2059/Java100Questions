//How to check Odd and Even Number in java.
package codingpract;
class OddEven
{
	int x;
	public int od(int a)
	{
		 x=a;
		return x;
		
	}
}
public class A13 {

	public static void main(String[] args) {
		OddEven oe=new OddEven();
		oe.od(20);
		int y=oe.x;
		if(y%2==0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
	}

}
