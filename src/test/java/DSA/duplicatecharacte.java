package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplicatecharacte {

	public static void main(String[] args) {
		
		String str="automation";
		
		Set<Character> set=new HashSet();
		Set<Character> duplicates=new HashSet();
		
		for(char ch:str.toCharArray())
		{
			if(!set.add(ch))
			{
				duplicates.add(ch);
			}
		}
		
		System.out.println(" "+duplicates);
		
		

	}

}
