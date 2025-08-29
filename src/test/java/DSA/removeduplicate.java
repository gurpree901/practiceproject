package DSA;

import java.util.HashSet;
import java.util.Set;

public class removeduplicate {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,1,2,4,5};
		
		Set<Integer> set=new HashSet();
		
		Set<Integer> duplicates=new HashSet();
		
		for(int num:a)
		{
			if(!set.add(num))
			{
				duplicates.add(num);
			}
		}
		
		System.out.println(" "+duplicates);

	}

}
