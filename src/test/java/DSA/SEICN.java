package DSA;

public class SEICN {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int num:a)
		{
			if(num>first)
			{
				second=first;
				first=num;
			}
			else if(num>second && first!=num)
			{
				second=num;
			}
		
		}
		
		System.out.println(" "+second);

	}

}
