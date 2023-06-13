//How to replace string with another string in java Program

package codingpract;
class Replacestring
{
	String x;
	String r;
	String replace;
	public void main(String a) 
	{
		this.x=a;
		System.out.println();
		System.out.println(x.replaceAll("is", "was"));
		rahul();
		System.out.println(replace);
		System.out.println();
		System.out.println(replace.replace('R', 'r'));
		System.out.println(replace.replaceFirst("Rahul", "Kholi"));
	}
	public String rahul()
	{
		r="Rahul was playing cricket";
		replace=r.replaceAll("was", "is");
		return replace;
		
	}
	
	
}
public class A38 {

	public static void main(String[] args) {
		Replacestring rst=new Replacestring();
		String a="Ayush is playing cricket";
		rst.main(a);

	}

}
