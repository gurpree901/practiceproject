package DSA;

public class revrsewpr {

	public static void main(String[] args) {
		
		String str="guru i am";
		
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			System.out.println(new StringBuilder(word).reverse().toString());
		}

	}

}
