package DSA;

import java.util.HashSet;
import java.util.Set;

public class removedup {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,2,1};
		
		Set<Integer> set=new HashSet();
		
		for(int num:a)
		{
			if(!set.add(num))
			{
				System.out.println(" "+num);
			}
		}
				
				

	}

}
