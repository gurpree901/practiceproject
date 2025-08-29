package DSA;

public class avg {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		
		int sum=0;
		for(int num:a)
		{
			sum+=num;
		}
		System.out.println("sum "+sum);
		
	   int 	avg=sum/a.length;
	   
	   System.out.println(" "+avg);

	}

}
