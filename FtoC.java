package codingpract;

class Temp
{
	double a1;
	double temp;
	
	public void tempss(double d)
	{
		a1=d;
		temp=((a1-32)*5)/9;
		System.out.println(temp);
			
	}
}
public class FtoC {

	public static void main(String[] args) {
	

		Temp kk=new Temp();
		kk.tempss(100);
		
	}

}
