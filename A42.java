//How to create method in java Program
package codingpract;

class Methoding
{
	static int c;
	Methoding(String a)    
	{
		System.out.println(a);
	}
	public static int methoda(int a,int b)
	{
		System.out.println("This is Static Method");
		if(a>b)
		{
			c=a+b;
			
		}
		else
		{
			c=a*b;
		}
		return c;
	
	}
	public void  methoda1(String c)
	{
		System.out.println(c);
	}
	
}


public class A42 {

	public static void main(String[] args) {
		String a="This is Constructor Method";
		Methoding obj=new Methoding(a);
		int z=Methoding.methoda(2,7);
		System.out.println(z);
		String c="This is Normal Method";
		obj.methoda1(c);
		A42 obj1=new A42();
		obj1.main();
		main2();
		
}
	public void main()
	{
		System.out.println("main in staic main method");
	}
	public static void main2()
	{
		System.out.println("The end");
	}

}

	
		
	
