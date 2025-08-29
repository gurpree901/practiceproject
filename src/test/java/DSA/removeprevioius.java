package DSA;

public class removeprevioius {

	public static void main(String[] args) {
		
		String str="i i want to go go to home";
		String[] words=str.split(" ");
		
		StringBuilder sb=new StringBuilder();
		String prevword="";
		for(String word:words)
		{
			if(!word.equals(prevword))
			{
				sb.append(word).append(" ");
				prevword=word;
			}
		}
		System.out.println(sb.toString().trim());

	}

}
