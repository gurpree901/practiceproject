package DSA;

import java.util.Arrays;

public class equaliry {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int a1[]= {1,2,3,4,5};
		
		/*boolean status=Arrays.equals(a, a1);
		
		if(status==true)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}*/
		
		
		if(a.length==a1.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==a1[i])
				{
					System.out.println("equal");
					break;
				}
			}
		}
		else
		{
			System.out.println("not equal");
		}

	}

}
