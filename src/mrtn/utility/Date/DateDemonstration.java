package mrtn.utility.Date;

import java.util.Date;

public class DateDemonstration
{
	public static void main(String[] args) {
		
		//O objeto date é já uma classe obsoleta do Java mais usado em sismteas legados, mas é importante saber o seu funcionamento. O seu calculo basico é por meio de milliseconds.
		Date date = new Date();
		System.out.println(date.toLocaleString());
		
		//O Methood "toLocalString()" retorna o formato para a área definida no computador
	}
}
