package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplicatene {

	public static void main(String[] args) {
		
		//Approach 1
		/*int[] arr = {1, 2, 3, 2, 4, 3};
		
		Set<Integer> set=new HashSet();
		Set<Integer> duplicates=new HashSet();
		
		for(int num:arr)
		{
			if(!set.add(num))
			{
				duplicates.add(num);
			}
		}
		
		System.out.println(" "+duplicates);*/
		
		int[] arr = {1, 2, 3, 2, 4, 3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(" duplicates"+arr[i]);
					break;
				}
			}
		}

	}

}
