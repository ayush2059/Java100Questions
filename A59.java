//How to open notepad in java Program
// need to create object of class Runtime
package codingpract;
import java.io.IOException;

class Notepad
{
	public void show()
	{
		Runtime rt=Runtime.getRuntime();
		try {
			rt.exec("notepad");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
public class A59 {

	public static void main(String[] args) {
		
		Notepad npd=new Notepad();
		npd.show();

	}}