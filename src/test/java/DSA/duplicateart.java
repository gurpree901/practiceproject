package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplicateart {

	public static void main(String[] args) {
		
		String [] ar= {"aman","ak","aja","oa","aman"};
		
		Set<String> set=new HashSet();
		
		for(String a:ar)
		{
			if(!set.add(a))
			{
				System.out.println(" "+a);
			}
		}
			
			
			
			

	}

}
