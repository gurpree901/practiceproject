package DSA;

public class evenodddindex {

	public static void main(String[] args) {
		
		String str="gurpreet";
		
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd index"+str.charAt(i));
			}
		}

	}

}
