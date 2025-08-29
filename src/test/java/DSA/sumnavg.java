package DSA;

public class sumnavg {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int sum=0;
		
		for(int num:a)
		{
			sum+=num;
		}
		
		int average =sum/a.length;
		
		System.out.println(" "+average);
				

	}

}
