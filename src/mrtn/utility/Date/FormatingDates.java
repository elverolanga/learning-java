package mrtn.utility.Date;

import java.text.DateFormat;
import java.util.Calendar;

public class FormatingDates {
	public static void main(String[] args) {
		
		//DateFormat - contem metodos preformatados para datas
		
		
		Calendar c = Calendar.getInstance();
		
		DateFormat[] df = new DateFormat[6];
		
		df[0] = DateFormat.getInstance();
		df[1] = DateFormat.getDateInstance();
		df[2] = DateFormat.getDateTimeInstance();
		df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
		df[4] = DateFormat.getDateInstance(DateFormat.LONG);
		df[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for(DateFormat d : df) {
			System.out.println(d.format(c.getTime()));
		}
	}
}
