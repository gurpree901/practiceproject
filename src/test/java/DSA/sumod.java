package DSA;

public class sumod {

	public static void main(String[] args) {
		
		String str="ababc13 23 hs 22 2jjj 2383";
		
		
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
