package DSA;

import java.util.Arrays;

public class unsortedarray {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,4};
		int a1[]= {6,5,7};
		
		int merged[]=new int[a.length+a1.length];
		
		System.arraycopy(a, 0, merged, 0, a.length);
		System.arraycopy(a1, 0, merged, a.length, a1.length);
		
		Arrays.sort(merged);
		
		System.out.println(" "+Arrays.toString(merged));

	}

}
