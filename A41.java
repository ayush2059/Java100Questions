//How to convert all char in string lower case in java Program

package codingpract;
class lowercase
{
	String u="AYUSH RAJ WILL GET CAR ONE DAY";
	String l;
	String u2="ayush will earn infinite money one day it is not a dream it is persistent";
	String l2;
	public void show()
	{
		l=u.toLowerCase();
		System.out.println(l);
	}
	public void show2()
	{
		l2=u.toUpperCase();
		System.out.println(l2);
	}
}
public class A41 {

	public static void main(String[] args) {
		lowercase lcse=new lowercase();
		lcse.show();
		lcse.show2();
	}

}
