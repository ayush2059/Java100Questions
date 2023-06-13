//How to string width with specific char in java Program

package codingpract;
class Endswith
{
	String x;
	boolean y;
	public void main()
	{
       String a="Ayush is working in tcs";
       show(a);
       System.out.println(y);
       String b="Ayush learning coading";
       System.out.println(b.startsWith("Ayush"));
	}
	public  boolean show(String a)
	{
		
		this.x=a;
		y=x.endsWith("c");
		return y;	
	}
}
public class A36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endswith ew=new Endswith();
		ew.main();

	}

}
