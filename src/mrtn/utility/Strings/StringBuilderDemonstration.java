package mrtn.utility.Strings;

public class StringBuilderDemonstration {

	public static void main(String[] args) {
		
		//String builder forma uma sequencia de caracteres(String) mutavel, que a cada modificação forma um novo objeto e permite fazer modificações diretas na "String" 
		
		//Exemplo
		//Ao criar uma instancia de um StringBuilder, temos 3 casos. 1. se não definir o tamanho como parametro, o básico é de 16c., 2. pode se passar o tamanho como parametro ou 3. uma String
		StringBuilder sb = new StringBuilder();
		
		sb.append("My name is: ");
		System.out.println(sb.toString());
		sb.append("Martin");
		
		//se fizer a impressão do objeto sb, agora a String vai conter o valor agregado a mesma
		
		System.out.println(sb.toString());
		
		//StringBuilders são também mais performaticas que a classe String.
	}
}
