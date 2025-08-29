package DSA;

public class firstcharacter {

	public static void main(String[] args) {
		
		String str="i am gurpreet";
		
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			if(!word.isEmpty())
			{
				System.out.println(word.charAt(0));
			}
		}
		
		

	}

}
