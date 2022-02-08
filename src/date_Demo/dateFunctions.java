package date_Demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFunctions {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toString());

		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		String strDate = formatter.format(date);
		formatter = new SimpleDateFormat("dd-MMM:yyyy: " + strDate);

		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println("Date Format with dd-M-yyyy hh:mm:ss : " + strDate);

		formatter = new SimpleDateFormat("dd MMMM yyyy");
		strDate = formatter.format(date);
		System.out.println("Date Format with dd MMMM yyyy : " + strDate);

		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = formatter.format(date);
		System.out.println("Date Format with dd MMMM yyyy zzzz : " + strDate);

		formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		strDate = formatter.format(date);
		System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : " + strDate);
	}

}
