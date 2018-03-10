package JavaBasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class bai47 {
	public static void main(String args[]) {
		SimpleDateFormat hiengio = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		hiengio.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("Hien gio: "+hiengio.format(System.currentTimeMillis()));
	}
}
