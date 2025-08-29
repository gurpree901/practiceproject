package DSA;

import java.util.HashSet;
import java.util.Set;

public class intersectin {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int a1[]= {2,4,6,7};
		
		Set <Integer> set=new HashSet();
		Set<Integer> intersect=new HashSet();
		
		for(int num:a)
		{
			set.add(num);
		}
		
		for(int num:a1)
		{
			if(set.contains(num))
			{
				intersect.add(num);
			}
		}
		
		for(int num:intersect)
		{
			System.out.println(" "+num);
		}

	}

}
