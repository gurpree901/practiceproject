package DSA;

public class sumst {

	public static void main(String[] args) {
		
		String str="aman 12 hsh2 dhdh 12 22j 2";
		
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
