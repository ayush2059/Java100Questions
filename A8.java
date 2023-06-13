//How to add two number Program in java
package codingpract;

 class Addo
{
	int a,b,total,c,d;
	public int sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		total=a+b;
		return total;
	}
		public void sum(int a,int b,int c)
		{
		   this.a=a;
		   this.b=b;
		   this.c=c;
		   total=a+b+c;
		   System.out.println(a+b+c);
		   
		 
		}
		
	
}
public class A8 {

	public static void main(String[] args) {
		Addo ad=new Addo();
		ad.sum(10, 5);
		int all=ad.total;
		System.out.println(all);
		ad.sum(5,6,7);
		
	}

}
