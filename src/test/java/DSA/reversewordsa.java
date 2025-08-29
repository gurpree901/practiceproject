package DSA;

public class reversewordsa {

	public static void main(String[] args) {
		
		String str="welcome to java";
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			System.out.println(new StringBuilder(word).reverse().toString());
		}

	}

}
