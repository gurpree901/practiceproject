package DSA;

public class previus {

	public static void main(String[] args) {
		
		String str="i wnat to to go to to home";
		
		String[] words=str.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		String prev=" ";
		
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
