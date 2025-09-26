package DSA;

import java.util.HashSet;
import java.util.Set;

public class arrya {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,3,2,4};
		
		Set<Integer> set=new HashSet();
		
		for(int num:a)
		{
			if(!set.add(num))
			{
				System.out.println("d"+num);
			}
		}

	}

}
