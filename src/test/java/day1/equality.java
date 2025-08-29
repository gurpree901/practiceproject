package day1;

import java.util.Arrays;

public class equality {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int a1[]= {1,2,3,4,5};
		
		/*boolean status=Arrays.equals(a, a1);
		if(status==true)
		{
			System.out.println("arrays are equal");
			
		}
		else
		{
			System.out.println("arrays are not equal");
		}*/
		
		//Approach 2
		boolean flag=true;
		if(a.length==a1.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=a1[i])
				{
					System.out.println("elemnt not equal..");
					flag=false;
				}
			}
		}
		else
		{
			flag=false;
		}
		
		if(flag=true)
		{
			System.out.println("elemnt matched");
		}
		
		

	}

}
