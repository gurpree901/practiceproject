package DSA;

import java.util.Arrays;

public class sortel {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,4,2};
		
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int num:a)
		{
			System.out.println(" "+num);
		}*/
		
		System.out.println("before sorting:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting:"+Arrays.toString(a));

	}

}
