package DSA;

import java.util.Arrays;

public class unsorted {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,5,4};
		
		int a1[]= {6,4,7,9,8};
		
		int mergedarray[]=new int[a.length+a1.length];
		
		System.arraycopy(a, 0, mergedarray, 0, a.length);
		System.arraycopy(a1, 0, mergedarray, a.length,a1.length);
		
		Arrays.sort(mergedarray);
		
		for(int num:mergedarray) {
			System.out.println(" "+num);
		}

	}

}
