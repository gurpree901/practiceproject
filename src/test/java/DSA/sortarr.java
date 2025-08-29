package DSA;

import java.util.Arrays;

public class sortarr {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,7,6};
		
		System.out.println(" before sort"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting:"+Arrays.toString(a));
	}

}
