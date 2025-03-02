package mrtn.utility.Locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class InternationalizatingDate {
	public static void main(String[] args) {
		
		//I will demonstrate how to use the class Locale to internationalize date, currency and numbers
		
		//For the Us - (year/month/day, dayOfTheWeek)
		Locale localeUS = new Locale("eng","US");
		
		Calendar calendar = Calendar.getInstance();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeUS);
		System.out.println("United States of America: " + df.format(calendar.getTime()));
		//or
		System.out.println(localeUS.getCountry() +": " + df.format(calendar.getTime()));
		
		//Para o formato Europeu- PT fica: (dia da semana, dia/mes/ano)
		Locale localePT = new Locale("pt", "PT");
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localePT);
		System.out.println("Portugal: " + df2.format(calendar.getTime()));
		
		System.out.println(localePT.getCountry() +": " + df2.format(calendar.getTime()));
	}
}
