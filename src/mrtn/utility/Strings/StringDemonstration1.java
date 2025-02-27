package mrtn.utility.Strings;

public class StringDemonstration1
{
	public static void main(String[] args) {
		
		/*Strings são imutaveis,
		então não podemos efectuar modificações
		*/
		
		String nome1 = "Martin";
		String nome2 = "Martin";
		
		System.out.println(nome1 == nome2); //Vai imprimir verdade
		
		//Mas por exemplo: ao concatenar a String "nome1" com uma outra String, continuara a imprimir verdade
		
		nome1.concat(" Elvero");
		System.out.println(nome1);
		System.out.println(nome1 == nome2);
		//Isso porque a String Constant Pool não criou uma nova referencia para a var nome1
		
		//A forma correta seria:
		nome1 = nome1.concat(" Elvero");
		System.out.println(nome1);
		System.out.println(nome1 == nome2);
		
		//Agora sim a var nome1 será diferente de nome1
		
	}
}
