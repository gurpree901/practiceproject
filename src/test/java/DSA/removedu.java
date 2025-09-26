package DSA;

import java.util.HashSet;
import java.util.Set;

public class removedu {

	public static void main(String[] args) {
		
		int[] array = {5, 2, 9, 1, 6, 2, 5};
		
		Set<Integer> set=new HashSet();
		
		for(int num:array)
		{
			if(set.add(num))
			{
				System.out.println(" remove duplicate"+num);
			}
		}
		
		

	}

}
