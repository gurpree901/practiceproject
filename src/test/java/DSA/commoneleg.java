package DSA;

import java.util.HashSet;
import java.util.Set;

public class commoneleg {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int a1[]= {2,4,8,9,10};
		
		Set<Integer> set=new HashSet();
		
		Set<Integer> commom=new HashSet();
		
		for(int num:a)
		{
			set.add(num);
		}
		
		for(int num:a1)
		{
			if(set.contains(num))
			{
				commom.add(num);
			}
		}
		
		System.out.println(" "+commom);

	}

}
