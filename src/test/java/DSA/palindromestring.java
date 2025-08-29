package DSA;

public class palindromestring {

	public static void main(String[] args) {
		
		String str="madamj";
		
		String rev= new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev))
		{
			System.out.println(" palindrome");
		}
		else
		{
			System.out.println("not ");
		}

	}

}
