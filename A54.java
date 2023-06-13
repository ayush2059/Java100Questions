//How to SQL Date in java Program
package codingpract;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

class SqlDate
{
	int d,m,y;
	String fd;
	GregorianCalendar gcl=new GregorianCalendar();
	public void showw()
	{
		d=gcl.get(Calendar.DAY_OF_MONTH);
		m=gcl.get(Calendar.MONTH)+1;
		y=gcl.get(Calendar.YEAR);
		fd=y+"-"+m+"-"+d;
		System.out.println(fd);
		Date date=Date.valueOf(fd);
		System.out.println(date);
}
}
public class A54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqlDate sld=new SqlDate();
		sld.showw();

	}

}
