package mrtn.utility.Date;

import java.util.Calendar;
import java.util.Date;


public class CalendarDemonstration {
	public static void main(String[] args) {
	
		//A classe abstrata Calendar foi criada na tentativa de resolver os problemas de internacionalização enfrentados ao se trabalhar com a classe Date
		
		Calendar c = Calendar.getInstance();
		
		//E é uma classe muito mais completa, oferecendo informações mais detalhadas sobre data e tempo
		
		//podemos usar a classe Calendar para instanciar objetos do tipo Date
		
		Date date = c.getTime();
		System.out.println(date);
		
		//Mas para systemas mais recentes usamos as classes do pacote java.time.*;
	}
}
