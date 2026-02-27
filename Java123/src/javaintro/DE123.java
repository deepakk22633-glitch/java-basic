package javaintro;
//dateandtime
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DE123 {
	public static void main(String [] args) {
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		LocalTime tt = LocalTime.now();
		System.out.println(tt);
		
		LocalDateTime ddt = LocalDateTime.now();
		System.out.println(ddt);
		System.out.println(ddt.getDayOfMonth());
		System.out.println(ddt.getHour());
		System.out.println(ddt.getMinute());
		System.out.println(ddt.getYear());
		System.out.println(ddt.getMonthValue());
	}

}
