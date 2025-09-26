package DSA;

public class upprlowe {

	public static void main(String[] args) {
		
		String str="ABCDaabbddAJ";
		
		StringBuilder upper =new StringBuilder();
		StringBuilder lower=new StringBuilder();
		
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
		
		System.out.println("upper"+upper);

	}

}
