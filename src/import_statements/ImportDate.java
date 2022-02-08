package import_statements;

import java.util.Date; // Priority-1
import java.sql.*; // Priority-3
/*
Order of priority is explicit import, default package,implicit import
*/
public class ImportDate {
int Date; // Priority-2
	public static void main(String[] args) {
		Date d = new Date(); // The type Date is ambiguous if explicit import is not used for util.Datew
		System.out.println(d);
	}
}
