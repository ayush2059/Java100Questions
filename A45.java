//Difference between Static and Instance method working in java Program
package codingpract;
class Tk
{   public void show()
	{
		System.out.println("instance method");
	}
	public static void show2()
	{
		System.out.println("static method");
	}
	static
	{
		System.out.println("The start");
	}
}
public class A45 {
   public static void main(String[] args) {
        show2();
        Tk ol=new Tk();
		A45 obj=new A45();
		obj.show();
		//Tk ol=new Tk();
		ol.show();
		Tk.show2();
	}
	public void show()
	{
		System.out.println("instance method");
	}
	public static void show2()
	{
		System.out.println("static method");
	}

}
