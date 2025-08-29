package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplcate {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,2,4,5};
		
		Set<Integer> set=new HashSet();
		
		for(int i=0;i<a.length;i++)
		{
			if(!set.add(a[i]))
			{
				a[i]=0;
			}
		}
		
		for(int num:a)
		{
			System.out.println(" "+num);
		}

	}

}
