package DSA;

public class reverse0 {

	public static void main(String[] args) {
		
		String str="welocme to java";
		
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			System.out.println(new StringBuilder(word).reverse().toString());
		}

	}

}
