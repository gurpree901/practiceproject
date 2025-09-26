package DSA;

public class ja {

	public static void main(String[] args) {
		
		String str = "Subbu123raj";
		
		StringBuilder letter=new StringBuilder();
		StringBuilder digit=new StringBuilder();
		
		for(char ch:str.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				letter.append(ch);
			}
			else
			{
				digit.append(ch);
			}
		}
		
		System.out.println(" letter"+letter.toString());
		System.out.println("digit"+digit.toString());

	}

}
