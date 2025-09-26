package DSA;

public class lowerca {

	public static void main(String[] args) {
		
		
		String str="Welcome To Java";
		
		String[] words=str.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for(String word:words)
		{
			if(word.length()>0)
			{
				sb.append(Character.toLowerCase(word.charAt(0)))
				.append(word.substring(1))
				.append(" ");
			}
		}
		
		System.out.println(sb.toString().trim());

	}

}
