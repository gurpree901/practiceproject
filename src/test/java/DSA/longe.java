package DSA;

public class longe {

	public static void main(String[] args) {
		
		String str="wleocme to java";
		
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
