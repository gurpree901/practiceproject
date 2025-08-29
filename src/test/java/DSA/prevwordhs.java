package DSA;

public class prevwordhs {

	public static void main(String[] args) {
		
		String str="i am going to to home am";
		
		String[] words=str.split(" ");
		
		StringBuilder sb=new StringBuilder();
		String prev=" ";
		
		for(String word:words)
		{
			if(!word.contains(prev))
			{
				sb.append(word).append(" ");
				prev=word;
			}
		}
		
		System.out.println(" "+sb.toString().trim());

	}

}
