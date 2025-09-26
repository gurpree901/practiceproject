package DSA;

public abstract class duplicast {

	public static void main(String[] args) {
		
		String str="i want to go to go home";
		
		String[] words=str.split(" ");
		StringBuilder sb=new StringBuilder();
		String prev="";
		
		for(String word:words)
		{
			if(!word.equals(prev))
			{
				prev=word;
				sb.append(prev).append(" ");
			}
		}
		
		System.out.println(" "+sb.toString().trim());
		
		

	}

}
