package codingpract;
class Gtst
{
	private String student_name;
	private int roll_no;
	
	public void settName(String a,int b)
	{
		this.student_name=a;
		this.roll_no=b;
	}
	public String getName()
	{
		return student_name;		
	}
	public int getName1()
	{
		return roll_no;			
	}
}
public class GetSetMethod {

	public static void main(String[] args) {
		Gtst obj=new Gtst();
		Gtst obj1=new Gtst();
		obj.settName("Ayush Raj",1);
		obj1.settName("Adarsh Raj",2);
		String a=obj.getName();
		int b=obj.getName1();
		String c=obj1.getName();
		int d=obj1.getName1();
		System.out.println(a+" "+b);
		System.out.println(c+" "+d);
		


	}

}
