package codingpract;
class Rahulk
{
	public static Rahulk show()
	{
		System.out.println("Ayush Static");
		return null;
	}
	public static void show2()
	{
		System.out.println("Ayush non static");
	}
}
public class Pract {

	public static void main(String[] args) {
		Rahulk rk=Rahulk.show();
		//System.out.println(rk);
		rk.show2();
		//System.out.println(rk);
		

	}

}
