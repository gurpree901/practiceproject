package DSA;

public class maxminarr {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int max=a[0];
		
		for(int num:a)
		{
			if(num>max)
			{
				max=num;
			}
		}
		System.out.println(" "+max);

	}

}
