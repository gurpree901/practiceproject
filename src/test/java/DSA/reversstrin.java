package DSA;

public class reversstrin {

	public static void main(String[] args) {
		
		
		String str="gurpreet";
		
		/*int len=str.length();
		String rev=" ";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(" rev "+rev);*/
		
		
		char[] ch=str.toCharArray();
		int len=str.length();
		String rev=" ";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(" rev"+rev);

	}

}
