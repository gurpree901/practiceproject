package DSA;

public class revrsewordd {

	public static void main(String[] args) {
		
		String str="welocme to java";
		
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			System.out.println(new StringBuilder(word).reverse().toString());
		}

	}

}
