package DSA;

public class uppercase {

	public static void main(String[] args) {
		
		
		String str = "aBACbcEDed";
		
		StringBuilder lower=new StringBuilder();
		StringBuilder upper=new StringBuilder();
		
		for(char ch:str.toCharArray())
		{
			if(Character.isUpperCase(ch))
			{
				upper.append(ch);
			}
			else
			{
				lower.append(ch);
			}
		}
		
		System.out.println(" "+lower);
		System.out.println(" "+upper);

	}

}
