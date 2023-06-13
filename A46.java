//How to create Multiple class in java Program
package codingpract;
class Cat
{
	Cat()
	{
		System.out.println("First");
	}
	public void cat_method()
	{
		System.out.println("second");
	}

}
public class A46 {
	public static void main(String[] args) {
		Cat ct=new Cat();
		ct.cat_method();
		A46 ao=new A46();
		ao.a46_method();
	}

	A46()
	{
		System.out.println("First A46");
	}
	public void a46_method()
	{
		System.out.println("Second A46");
	}
	
	


}

