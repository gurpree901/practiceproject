package DSA;

public class palindromeaga {

	public static void main(String[] args) {
		
		String str="madam";
		
		String rev= new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("no");
		}

	}

}
