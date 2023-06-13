//Command Line Argument in java

package codingpract;

class Third
{
	String aa;
	String finnal;
	public void Ayush(String a)
	{
		this.aa=a;
		finnal=aa.replaceAll("[@,;:?]","");
		System.out.println(finnal);
	}
}
public class Aaa {

	public static void main(String[] args) {
		Third tr=new Third();
		{
		  tr.Ayush("@;a:b?c;");
		}

	}

}
