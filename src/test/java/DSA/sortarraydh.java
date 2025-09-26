package DSA;

import java.util.Arrays;

public class sortarraydh {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,5,4,6};
		
		/*System.out.println("befre sorting:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sort"+Arrays.toString(a));*/
		
		
		
		for(int i=0;i<a.length;i++)
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
		}

	}

}
