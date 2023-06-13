//How perform garbage collection in javam  Program
//to clear h=garbage collection we have to create object of "Runtime" class
package codingpract;
class Garbagecollection
{
	public void show()
	{
		Runtime rt=Runtime.getRuntime();                              
		System.out.println("Before cleaning"+" "+rt.freeMemory());
		rt.gc();
		System.out.println("After cleaning"+" "+rt.freeMemory());
	}
	
	
	
}


public class A57 {

	public static void main(String[] args) {
		Garbagecollection gct=new Garbagecollection();
		gct.show();

	}

}
