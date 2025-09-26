package DSA;

public class digitsinstring {

	public static void main(String[] args) {
		
		String str="abbcc1234";
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
		
		System.out.println(" letter "+letter);
		System.out.println("digit"+digit);

	}

}
