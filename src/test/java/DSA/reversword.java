package DSA;

public class reversword {

	public static void main(String[] args) {
		
		String str="i love my india";
		
		/*String[] words=str.split(" ");
		
		for(String word:words)
		{
			System.out.println(new StringBuilder(word).reverse().toString());
		}*/
		
		
		String[] words=str.split(" ");
		
		String rev=" ";
		
		for(int i=words.length-1;i>=0;i--)
		{
			rev+=words[i]+" ";
		}
		
		System.out.println(rev.trim());
		
		

	}

}
