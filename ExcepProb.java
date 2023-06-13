package codingpract;
class Lkol
{
	String name="Ayush";
	Lkol()
	{
		System.out.println("ok");
	}
	public String toString()
	{
		return name ;
		
	}
	
}
public class ExcepProb {

	public static void main(String[] args) {
		Lkol lo=new Lkol();
		System.out.println(lo);
		String s1=new String("Ayush");
		System.out.println(s1);
		System.out.println(lo.toString());
		

	}

}
