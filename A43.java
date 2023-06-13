//Find Length, Concatenate and Replace String in Java Program
package codingpract;
class june7
{
	String x,y;
	int l;
	public void main(String a)
	{
		this.x=a;
		l=x.length();
		System.out.println(l);
	}
	public void main2(String a)
	{
		this.x=a;
		y=a.replace("AyushRaj", "AdarshRaj");
		System.out.println(y);
	}
	public void main3(String a)
	{
		this.x=a;
		y=a.concat("Adarsh raj Brothers");
		System.out.println(y);
	}
	
}
public class A43 {

	public static void main(String[] args) {
		String a="AyushRaj";
		june7 j7=new june7();
		j7.main(a);
		j7.main2(a);
        j7.main3(a);
	}

}
