//How to Date format in java Program 
//create date class object //create SimpleDateFormat class object //zzzz-India Standard Time //z-ist //e=day name
//run time polymorpshim 
package codingpract;
import java.sql.Date;
import java.text.SimpleDateFormat;

class DateDesg
{
	public void date()
	{
		Date dt=new Date(0);
		System.out.println("DATE FORMATER START FROM HERE");
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		String sdate=sdf.format(dt);		
		System.out.println("Date Format with MM-dd-yyyy"+"->"+sdate);
		
		sdf=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		sdate=sdf.format(dt);
		System.out.println("Date Format with dd-M-yyyy hh:mm:ss"+"->"+sdate);
		
		sdf=new SimpleDateFormat("dd MMMM yyyy");
		sdate=sdf.format(dt);
		System.out.println("Date Format with dd MMMM yyyy"+"->"+sdate);
		
		sdf=new SimpleDateFormat("dd MMMM yyyy zzzz");
		sdate=sdf.format(dt);
		System.out.println("Date Format with dd MMMM yyyy zzzz"+"->"+sdate);
		
		sdf=new SimpleDateFormat("E,dd,MMM yyyy HH:mm:ss z");
		sdate=sdf.format(dt);
		System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z"+"->"+sdate);
	}
	

}

public class A55 {
	public static void main(String[] args) {
		DateDesg dsg=new DateDesg();
		dsg.date();
		
	}

}
