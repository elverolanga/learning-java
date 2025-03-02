package mrtn.utility.Locale;

import java.text.NumberFormat;
import java.util.Locale;

public class InternationalizatingNumbers {
	public static void main(String[] args) {
		
		NumberFormat[] nf = new NumberFormat[5];
		Locale localePT = new Locale("pt", "PT");
		Locale localeUS = Locale.US;
		Locale localeJP = Locale.JAPAN;
		Locale localeDE = Locale.GERMAN;
		
		nf[0] = NumberFormat.getInstance();
		nf[1] = NumberFormat.getInstance(localePT);
		nf[2] = NumberFormat.getInstance(localeUS);
		nf[3] = NumberFormat.getInstance(localeJP);
		nf[4] = NumberFormat.getInstance(localeDE);
		
		double valor = 100033;
		
		for(NumberFormat n : nf)
		{
			System.out.println(n.format(valor));
		}
	}
}
