package DSA;

public class evenoddd {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int even_count=0;
		int odd_count=0;
		for(int num:a)
		{
			if(num%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}

	}

}
