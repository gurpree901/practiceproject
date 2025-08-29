package DSA;

import java.util.Arrays;

public class secondss {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		/*int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int num:a)
		{
			if(num>first)
			{
				second=first;
				first=num;
			}
			else if(num>second && num!=first)
			{
				second=num;
			}
		}
		
		System.out.println(" "+second);*/
		
		
		Arrays.sort(a);
		
		System.out.println("second number:"+a[a.length-2]);
			

	}

}
