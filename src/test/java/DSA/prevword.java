package DSA;

public class prevword {

	public static void main(String[] args) {
		
		String str="i am going to to home to i ";
		
		String[] words=str.split(" ");
		StringBuilder sb=new StringBuilder();
		
		String prev="";
		
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
