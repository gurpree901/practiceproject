package DSA;

public class evenindex {

	public static void main(String[] args) {
		
		String str="welcome";
		
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				System.out.println("even index"+str.charAt(i));
			}
		}
		
	
	}

}
