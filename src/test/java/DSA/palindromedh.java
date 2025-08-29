package DSA;

public class palindromedh {

	public static void main(String[] args) {
		
		String str="madam";
		
		String rev=new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev))
		{
			System.out.println(" palindorme");
		}
		else
		{
			System.out.println(" not");
		}

	}

}
