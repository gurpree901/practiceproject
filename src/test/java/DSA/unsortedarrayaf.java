package DSA;

import java.util.Arrays;

public class unsortedarrayaf {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,5,4};
		int a1[]= {7,6,5};
		
		int mergedarray[]=new int[a.length+a1.length];
		System.arraycopy(a, 0, mergedarray, 0, a1.length);
		System.arraycopy(a1, 0 ,mergedarray, a.length,a1.length);
		
		Arrays.sort(mergedarray);
		
		System.out.println(Arrays.toString(mergedarray));
		
		
		
		
		

	}

}
