package DSA;

public class sumin {

	public static void main(String[] args) {
		
		String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
		
		
		int sum=0;
		
		for(String num:array)
		{
			
			if(num.matches("\\d+"))
			{
				int hh=Integer.parseInt(num);
				sum+=hh;

			}
			
			
			
			
			
		}

		
		System.out.println(sum);
	}

}
