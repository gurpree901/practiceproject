package DSA;

public class longests {

	public static void main(String[] args) {
		
		String str="welocme to java";
		
		String[] words=str.split(" ");
		
		String longest=" ";
		
		for(String word:words)
		{
			if(word.length()>longest.length())
			{
				longest=word;
			
			}
		}
		
		System.out.println(" "+longest);

	}

}
