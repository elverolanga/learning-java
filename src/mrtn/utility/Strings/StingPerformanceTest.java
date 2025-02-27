package mrtn.utility.Strings;

public class StingPerformanceTest
{
	public static void main(String[] args) 
	{
		long start = System.currentTimeMillis();
		concatString(500);
		long end = System.currentTimeMillis();
		
		System.out.println("Tempo de execução: " + (end - start) + "ms");
	
		 start = System.currentTimeMillis();
		concatStringBuilder(500);
		 end = System.currentTimeMillis();
		
		System.out.println("Tempo de execução StringBuilder: " + (end - start) + "ms");

	}
	
	public static void concatString(int tamanho) 
	{
		String text = "";
		for(byte i = 0; i < tamanho; i++) 
		{
			text += i;
		}
	}
	
	public static void concatStringBuilder(int tamanho) 
	{
		StringBuilder sb = new StringBuilder(tamanho);
		for(byte i = 0; i < tamanho; i++) 
		{
			sb.append(i);
		}
	}
}
