//How to split string in java Program
package codingpract;
class Spilit
{
   String x;
   String[]arr;
   String y;
   String z;
   
	public void show(String a)
	{
		this.x=a;
		arr=x.split(";");
		for(int i=0;i<arr.length;i++)
		{
			y=arr[i];
			print(y);
		}
		
	}
	public void print(String q)
	{
		this.z=q;
		System.out.println(z);
		
	}
	
	
}
public class A39 {

	public static void main(String[] args) {
	String a="S1234;S2345;S4322;S9876;S3421;S9087;S23334;S2019;S2020;S2021;S2022;S20233";
	Spilit lt=new Spilit();
	lt.show(a);
	
	      
	    
	
		
		
	}}
