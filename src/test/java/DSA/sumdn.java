package DSA;

public class sumdn {

	public static void main(String[] args) {
		
		String str="amsn12 23 jf 22 3j 3";
		
		String[] words=str.split(" ");
		int sum=0;
		
		for(String word:words)
		{
			if(word.matches("\\d+"))
			{
				sum+=Integer.parseInt(word);
			}
		}
		System.out.println(" "+sum);

	}

}
