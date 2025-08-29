package DSA;

public class firstcahracter {

	public static void main(String[] args) {
		
		String str="welcme to java";
		
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			System.out.println(new StringBuilder(word).reverse().toString());
		}

	}

}
