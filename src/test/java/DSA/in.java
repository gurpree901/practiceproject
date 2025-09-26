package DSA;

public class in {

	public static void main(String[] args) {
		
		String[] array= {"5", "2", "9", "a", "1", "6", "#", "3"};
		
		int sum=0;
		for(String num:array)
		{
			if(num.matches("\\d+"))
			{
				int d=Integer.parseInt(num);
				sum+=d;
			}
		}
		System.out.println(" "+sum);
		
		

	}

}
