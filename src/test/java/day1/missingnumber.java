package day1;

public class missingnumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elemnt:"+sum);
		
		//int a1[]= {1,2,3,4,5};
		int sum1=0;
		
		for(int i=1;i<=5;i++)
		{
			sum1=sum1+i;
		}
		System.out.println("sumof ele:"+sum1);
		
		System.out.println("missing elemnt from array:"+(sum1-sum));

	}

}
