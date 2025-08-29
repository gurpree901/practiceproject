package DSA;

public class longestword {

	public static void main(String[] args) {
		
		String str="welocme to java";
		
		String longest=" ";
		
		String[] words=str.split(" ");
		
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
