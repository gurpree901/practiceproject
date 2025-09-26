package DSA;

public class Stringint {

	public static void main(String[] args) {
		
		String str="welcme 23 hshs2 33 hssh3 3";
		
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
