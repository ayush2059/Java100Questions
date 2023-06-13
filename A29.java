//Find All substring of string in java Program

package codingpract;

import java.util.Scanner;

class Substring
{

	String str="AmanSharma";
	int l=str.length();
	public void show8()
	{
		for(int i=0;i<l;i++)
		{
			for(int j=i;j<l;j++)
			{
				System.out.println(str.substring(i, j+1));
			}
		}
	}
	
	
}
public class A29 {

	public static void main(String[] args) {
		
		Substring str1=new Substring();
		str1.show8();
		
	
	
	}}
