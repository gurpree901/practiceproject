package DSA;

public class lowerupperna {

	public static void main(String[] args) {
		
		String str="welcome to java";
		
		
		StringBuilder sb=new StringBuilder();
		
		String[] words=str.split(" ");
		for(String word:words)
		{
			if(word.length()>0)
			{
				sb.append(Character.toUpperCase(word.charAt(0)))
				.append(word.substring(1))
				.append(" ");
			}
		}
		
		System.out.println(" "+sb.toString().trim());

	}

}
