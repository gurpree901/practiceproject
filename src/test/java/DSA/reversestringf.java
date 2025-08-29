package DSA;

public class reversestringf {

	public static void main(String[] args) {
		
		String str="aman";
		
		String rev=" ";
		int len=str.length();
		
		/*for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(" "+rev);*/
		
		char[] ch=str.toCharArray();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		
		System.out.println(rev);
		
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse().toString());
			
			
			
			
			
			
			
			
		

	}

}
