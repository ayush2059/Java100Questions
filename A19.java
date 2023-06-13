//While loop Program in java
package codingpract;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Whiles
{
	int a;
	public void main()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		a=s.nextInt();
		while(a>0)
		{
			System.out.println("Display no->"+a);
			System.out.println("enter the next no");
			a=s.nextInt();
		}
		
		System.out.println("out of loop");
	}
}
public class A19 {

	public static void main(String[] args) {
		
		Whiles wl=new Whiles();
		wl.main();

	

}}
