package DSA;

import java.util.HashSet;
import java.util.Set;

public class reovedup {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,4,3,2,6,7};
		
		Set<Integer> set=new HashSet();
		Set<Integer> dup=new HashSet();
		
		for(int num:a) {
	
			if(!set.add(num))
			{
				dup.add(num);
				
				
			}
		}
		System.out.println(" "+dup);
		

	}

}
