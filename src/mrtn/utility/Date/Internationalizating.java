package mrtn.utility.Date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Internationalizating {
	public static void main(String[] args) {
		
		//I will demonstrate how to use the class Locale to internationalize date, currency and numbers
		
		Locale localeUS = new Locale("eng","US");
		
		Calendar calendar = Calendar.getInstance();
		DateFormat.getDateInstance(DateFormat.FULL, localeUS);
		
	}
}
