package DSA;

public class ie {

	public static void main(String[] args) {
		
		 String str = "Order123 delivered with 2 items costing 45";
		 
		String[] words= str.split(" ");
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
