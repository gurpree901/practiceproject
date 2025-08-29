package DSA;

public class firstcaharacter {

	public static void main(String[] args) {
		
		String str="welcome to java";
		
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
