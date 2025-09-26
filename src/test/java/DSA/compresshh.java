package DSA;

public class compresshh {

	public static void main(String[] args) {
		
		String str="aabbccddee";
		
		StringBuilder sb=new StringBuilder();
		int count=1;
		
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
