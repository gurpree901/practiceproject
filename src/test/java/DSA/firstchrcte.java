package DSA;

public class firstchrcte {

	public static void main(String[] args) {
		
		String str="welcome to java";
		
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			System.out.println(word.charAt(0));
		}

	}

}
