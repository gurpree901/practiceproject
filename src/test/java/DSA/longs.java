package DSA;

public class longs {

	public static void main(String[] args) {
		
		String str="welocme to java";
		
		String[] words=str.split(" ");
		String longes=" ";
		
		for(String word:words)
		{
			if(word.length()>longes.length())
			{
				longes=word;
			}
		}
		
		System.out.println(" "+longes);
		

	}

}
