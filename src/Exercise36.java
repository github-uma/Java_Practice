import java.util.*;
import java.text.*;

public class Exercise36 {
	public static void main(String[] args) {
		// Unix seconds
		long timestamp = 1571966749;
		// convert seconds to milliseconds
		Date date = new Date(timestamp * 1000L);
		// format of the date
		SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		jdf.setTimeZone(TimeZone.getTimeZone("GMT-5:30"));
		String java_date = jdf.format(date);
		System.out.println("\n" + java_date + "\n");
	}
}