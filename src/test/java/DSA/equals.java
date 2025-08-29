package DSA;

import java.util.Arrays;

public class equals {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int a1[]= {1,2,3,4,5};
		
		boolean status=Arrays.equals(a, a1);
		
		if(status==true)
		{
			System.out.println(" arrays are equal");
		}

	}

}
