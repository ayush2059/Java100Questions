//How to swap 2 no without using 3rd variable Program in java
package codingpract;
class Swaptwomo
{
	int a,b;
	public Swaptwomo(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("befor"+" "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("befor"+" "+a+" "+b);
	}
}
public class A7 {

	public static void main(String[] args) {
		Swaptwomo k =new Swaptwomo(10,20);
		
	}

}
