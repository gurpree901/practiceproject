package DSA;

public class removeprevword {

	public static void main(String[] args) {
		
		String str="i want to go to go to home";
		
		String[] words =str.split(" ");
		StringBuilder sb=new StringBuilder();
		
		String prev=null;
		
		for(String word:words)
		{
			if(!word.equals(prev))
			{
				sb.append(word).append(" ");
				prev=word;
			}
		}
		
		System.out.println(" "+sb.toString().trim());
		
		
		
		

	}

}
