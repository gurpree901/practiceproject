package DSA;

import java.util.HashSet;
import java.util.Set;

public class removeduplicateag {

	public static void main(String[] args) {

		String [] words= {"aman","jav","guru","gurpreet","guru","jav"};
		
		Set<String > set=new HashSet();
		Set<String> duplicate=new HashSet();
		
		for(String word:words)
		{
			if(set.add(word))
			{
				duplicate.add(word);
			}
		}
		
		System.out.println(" "+duplicate);
	}

}
