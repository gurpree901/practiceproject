package DSA;

public class stringintger {

	public static void main(String[] args) 
	
	{
		
		String str="ababbc123 13 2 jj 2 2";
		
		String[] words=str.split(" ");
		int sum=0;
		
		for(String word:words)
		{
			if(word.matches("\\d+"))
			{
				sum+=Integer.parseInt(word);
			}
		}
		System.out.println(" sum"+sum);
	
	
	

	}

}
