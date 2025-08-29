package DSA;

import java.util.HashSet;
import java.util.Set;

public class intdu {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,2};
		int a1[]= {2,3,4,7,8};
		
		Set<Integer> set=new HashSet();
		Set<Integer> common=new HashSet();
		
		for(int num:a)
		{
			set.add(num);
		}
		
		for(int num:a1)
		{
			if(set.contains(num))
			{
				common.add(num);
			}
		}
		
		System.out.println(" "+common);
			
			

	}

}
