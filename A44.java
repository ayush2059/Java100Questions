//How Static block working in java Program
package codingpract;
class ninejuly
{
	static int x;
	public static void show1()
	{
		System.out.println("the end");
	}
	public void show()
	{
		System.out.println("ayush raj");
	}
	static   //staic block excute block and then class overload take place;
	{
		System.out.println("static initilize first");
		x=10;
		
	}
}
public class A44 {

	public static void main(String[] args) {
		ninejuly ly=new ninejuly();
	   ly.show();
	   ly.show1();
	}
	   static
	   {
		   System.out.println("ayush");
	   }
		
		
	
}
