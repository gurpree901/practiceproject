package DSA;

import java.util.HashSet;
import java.util.Set;

public class replaceduplicates {

	public static void main(String[] args) {
		
		int a[]= {1,2,1,3,2,4,5,3};
		
		Set<Integer> set=new HashSet();
		
		for(int i=0;i<a.length;i++)
		{
			if(!set.add(a[i]))
			{
				a[i]=9;
			}
		}
		
		for(int num:a)
		{
			System.out.println(" "+num);
		}

	}

}
