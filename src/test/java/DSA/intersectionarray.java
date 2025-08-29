package DSA;

import java.util.HashSet;
import java.util.Set;

public class intersectionarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int a1[]= {4,5,2,8};
		
		Set<Integer> set=new HashSet();
		Set<Integer> intersection=new HashSet();
		for(int num:a)
		{
			
			set.add(num);
				
			
		}
		
		for(int num:a1)
		{
			if(set.contains(num))
			{
				intersection.add(num);
			}
		}
		
		for(int num:intersection)
		{
			System.out.println(" "+num);
		}

	}

}
