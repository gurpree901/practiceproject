package DSA;

public class lowerupper {

	public static void main(String[] args) {
		
		String str = "aBACbcEDed";
		
		StringBuilder lower=new StringBuilder();
		StringBuilder upper=new StringBuilder();
		
		for(char ch:str.toCharArray())
		{
			if(Character.isLowerCase(ch))
			{
				lower.append(ch);
			}
			else
			{
				upper.append(ch);
			}
		}
		
		System.out.println("lower case:"+lower);
		System.out.println("upper case:"+upper);

	}

}
