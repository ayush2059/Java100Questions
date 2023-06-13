//How to print date and time in java Program
package codingpract;

import java.util.Calendar;
import java.util.GregorianCalendar;

class DayTime
{
	int date,month,year,hour,minutes,second;
	String dt,time;
	String hr;
	int l;
	char a,b;
	String ftl;
	GregorianCalendar gc=new GregorianCalendar();
	public void get_Detail()
	{
		date=gc.get(Calendar.DAY_OF_MONTH);
		month=gc.get(Calendar.MONTH)+1;
		year=gc.get(Calendar.YEAR);
		hr=String.valueOf(year);
		l=hr.length();
		a=hr.charAt(l-2);
		b=hr.charAt(l-1);
		ftl=date+"-"+month+"-"+a+""+b;
		hour=gc.get(Calendar.HOUR);
		minutes=gc.get(Calendar.MINUTE);
		second=gc.get(Calendar.SECOND);
	    dt=date+"-"+month+"-"+year;
	    time=hour+":"+minutes+":"+second;
	    System.out.println(ftl);
	    System.out.println(dt);
		System.out.println(time);
    }
	
}


public class A53 {

	public static void main(String[] args) {
		DayTime dt=new DayTime();
		dt.get_Detail();
		}
}
