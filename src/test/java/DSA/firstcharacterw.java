package DSA;

public class firstcharacterw {

	public static void main(String[] args) {
		
		String str="wl to js";
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			System.out.println(word.charAt(0));
		}

	}

}
