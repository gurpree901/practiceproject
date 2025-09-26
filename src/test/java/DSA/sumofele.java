package DSA;

import java.util.HashSet;
import java.util.Set;

public class sumofele {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,3,2,2,4,5};
		
		Set<Integer> set=new HashSet();
		
		int sum=0;
		
		for(int num:a)
		{
			if(set.add(num))
			{
				sum+=num;
			}
		}
		System.out.println(" "+sum);

	}

}
