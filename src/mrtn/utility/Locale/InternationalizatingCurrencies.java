package mrtn.utility.Locale;

import java.text.NumberFormat;
import java.util.Locale;

public class InternationalizatingCurrencies {
	public static void main(String[] args) {
		
		NumberFormat[] nf = new NumberFormat[5];
		Locale localePT = new Locale("pt", "PT");
		Locale localeUS = Locale.US;
		Locale localeJP = Locale.JAPAN;
		Locale localeDE = Locale.GERMAN;
		
		nf[0] = NumberFormat.getCurrencyInstance();
		nf[1] = NumberFormat.getCurrencyInstance(localePT);
		nf[2] = NumberFormat.getCurrencyInstance(localeUS);
		nf[3] = NumberFormat.getCurrencyInstance(localeJP);
		nf[4] = NumberFormat.getCurrencyInstance(localeDE);
		
		double valor = 100033;
		
		for(NumberFormat n : nf)
		{
			System.out.println(n.format(valor));
		}		
		
		//And this is how you internationalize Values
	}
}
