package DSA;

public class stringfirstcharacter {

	public static void main(String[] args) {
		
		String str="welocme to java";
		
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			if(!word.isEmpty())
			{
				System.out.println(" "+word.charAt(0));
			}
		}

	}

}
