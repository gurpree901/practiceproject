package DSA;

public class Stringsum {

	public static void main(String[] args) {
		
		String str="amams 12 ddhd22 1233 dhdsh22 22";
		
		String[] words=str.split(" ");
		int sum=0;
		
		for(String word:words)
		{
			if(word.matches("\\d+"))
			{
				sum+=Integer.parseInt(word);
			}
		}
		
		System.out.println(" sum:"+sum);

	}

}
