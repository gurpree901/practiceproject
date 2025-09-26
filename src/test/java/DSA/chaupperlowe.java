package DSA;

public class chaupperlowe {

	public static void main(String[] args) {
		
		String str="ABCDaajjdDJD";
		
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
		System.out.println(" lower:"+upper);

	}

}
