//How to create Interface in java Program
package codingpract;
interface cricket_order
{
	int a=11;
	static String name="Team india";
}
class reality implements cricket_order
{
	char b='A';
   public void show()
   {
	   for(int i=1;i<=a;i++)
	   {
		  for(int j=i;j<=i;j++)
		  {
			  System.out.println(i+" "+b+" "+name);
			  b++;
		  
		  }
	   }
}}
public class A52 {

	public static void main(String[] args) {
		reality ty=new reality();
		ty.show();

	}

}
