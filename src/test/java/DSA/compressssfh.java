package DSA;

public class compressssfh {

	public static void main(String[] args) {
		
		String str="aabbccddee";
		
		int count=1;
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<=str.length();i++)
		{
			if(i==str.length() || str.charAt(i)!=str.charAt(i-1))
			{
				sb.append(str.charAt(i-1)).append(count);
				count=1;
			}
			else
			{
				count++;
			}
		}
		
		System.out.println(" "+sb.toString());

	}

}
