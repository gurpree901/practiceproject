package DSA;

public class sumofi {

	public static void main(String[] args) {
		
		String str="abcd13 123 snsnj 22";
		
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
