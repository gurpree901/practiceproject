package DSA;

import java.util.HashSet;
import java.util.Set;

public class common {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int a1[]= {1,3,6,7};
		
		Set<Integer> set=new HashSet();
		Set<Integer> com=new HashSet();
		
		for(int num:a)
		{
			set.add(num);
		}
		
		for(int num:a1)
		{
			if(set.contains(num))
			{
				com.add(num);
			}
		}
		
		System.out.println(" "+com);

	}

}
