package DSA;

public class cha {

	public static void main(String[] args) {
		
		String Str = "Subbu123raj";
		
		StringBuilder letter=new StringBuilder();
		StringBuilder digit=new StringBuilder();
		
		for(char ch:Str.toCharArray())
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
		System.out.println("le"+letter);

	}

}
