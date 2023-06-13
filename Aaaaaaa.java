package codingpract;
class SWAP
{
	int a1,b1,c1;
	public void lod(int a, int b)
	{
		this.a1=a;
		this.b1=b;
		System.out.println("before"+" "+a1+" "+b1 );
		c1=a;
		a1=b;
		b1=c1;
		System.out.println("before"+" "+a1+" "+b1 );
		
	}
	
}
public class Aaaaaaa {

	public static void main(String[] args) {
		SWAP s=new SWAP();
		s.lod(10, 15);

	}

}
