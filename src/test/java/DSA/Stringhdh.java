package DSA;

public class Stringhdh {

	public static void main(String[] args) {
		
		String str="aman 12 ajd2 2 2jj 1";
		
		String[] words=str.split(" ");
		int sum=0;
		
		for(String word:words)
		{
			if(word.matches("\\d+"))
			{
				int n=Integer.parseInt(word);
				sum+=n;
			}
		}
		
		System.out.println(" "+sum);

	}

}
