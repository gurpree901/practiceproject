package DSA;

import java.util.Arrays;

public class unsortedarraydd {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,4};
		int a1[]= {5,7,6};
		
		int mergdarray[]=new int[a.length+a1.length];
		
		System.arraycopy(a, 0, mergdarray, 0, a.length);
		System.arraycopy(a1, 0, mergdarray, a.length ,a1.length);
		
		Arrays.sort(mergdarray);
		
		System.out.println(Arrays.toString(mergdarray));
		

	}

}
