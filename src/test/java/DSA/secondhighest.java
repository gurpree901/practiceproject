package DSA;

public class secondhighest {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int num:a)
		{
			if(num>first)
			{
				first=num;
				second=first;
			}
			else if(num>second && num!=first)
			{
				second=num;
				
			}
				
		}
		System.out.println(" "+second);

	}

}
