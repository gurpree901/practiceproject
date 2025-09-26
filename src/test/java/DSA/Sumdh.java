package DSA;

public class Sumdh {

	public static void main(String[] args) {
		
		String str="amans 22 dsjdsj 23 djdj2 sdsj ";
		
		String[] words=str.split(" ");
		int sum=0;
		
		for(String word:words)
		{
			if(word.matches("\\d+"))
			{
				sum+=Integer.parseInt(word);
			}
		}
		
		System.out.println(" "+sum);

	}

}
