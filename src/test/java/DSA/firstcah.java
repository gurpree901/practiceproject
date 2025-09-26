package DSA;

public class firstcah {

	public static void main(String[] args) {
		
		String str="welcome to jaav";
		
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			System.out.println(word.charAt(0));
		}

	}

}
