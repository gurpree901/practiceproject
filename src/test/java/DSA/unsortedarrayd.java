package DSA;

import java.util.Arrays;

public class unsortedarrayd {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,4};
		int a1[]= {6,5,7};
		
		int newarray[]=new int[a.length+a1.length];
		
		System.arraycopy(a, 0, newarray, 0, a.length);
		System.arraycopy(a1, 0, newarray, a.length, a1.length);
		
		Arrays.sort(newarray);
		
		System.out.println(" "+Arrays.toString(newarray));

	}

}
