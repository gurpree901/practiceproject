package DSA;

public class evenindexa {

	public static void main(String[] args) {
		
		String str="welcome";
		
		int even=0;
		
		
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				System.out.println("even index:"+str.charAt(i));
			}
		}

	}

}
