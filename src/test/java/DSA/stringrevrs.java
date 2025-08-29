package DSA;

public class stringrevrs {

	public static void main(String[] args) {
		
		String str="amansingh";
		
		String rev=" ";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(" "+rev);

	}

}
