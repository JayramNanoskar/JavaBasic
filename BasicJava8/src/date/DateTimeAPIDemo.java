package date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

/**
 * Previous API issues - 
 * Prior JDK 1.8, there were same class present in two different packages('util' & 'sql'). So it was problematic while taking new Date();
 * To format date, need to import 'text' package.
 * All date classes were not thread-safe(threads used to suffer while working on same object)
 */

/**
 * New API -
 * DateTime api belongs to java.time package
 * Addresses those issues and it is immutable also means if we are changing value it will create new object.
 */
public class DateTimeAPIDemo {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now(); //gives only date
		System.out.println(d); //2021-01-16
		System.out.println(new Date()); //Sat Jan 16 14:25:25 IST 2021 //using old api here, gives date, time
		
		LocalDate d1 = LocalDate.of(2021, 1, 15); //gives mentioned date
		LocalDate d2 = LocalDate.of(2021, Month.JANUARY, 16); //using enum // throws java.time.DateTimeException if input is wrong(let say date if exceeds)
		System.out.println(d1); //2021-01-15
		System.out.println(d2); //2021-01-16

		LocalTime t = LocalTime.now();
		System.out.println(t); //14:25:25.505
		
		for(String z : ZoneId.getAvailableZoneIds()){ //gives set of available zone IDs
//			System.out.println(z);
		}
		
		LocalTime t2 = LocalTime.now(ZoneId.of("America/Chicago")); //gives GMT
		System.out.println(t2); //02:55:25.512
		
		Instant i = Instant.now(); //gives GMT with date, time and zone
		System.out.println(i); //2021-01-16T08:55:25.530Z
		
		LocalDateTime dt = LocalDateTime.now(); //gives date, time without zone
		System.out.println(dt); //2021-01-16T14:25:25.540
	}

}
