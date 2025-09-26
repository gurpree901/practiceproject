package DSA;

import java.util.HashSet;
import java.util.Set;

public class Duplicateah {

	public static void main(String[] args) {
		
		String str="welcome to java to java";
		
		String[] words=str.split(" ");
		
		Set<String> set=new HashSet();
		StringBuilder sb=new StringBuilder();
		
		for(String word:words)
		{
			if(!set.add(word))
			{
				System.out.println("duplicateword:"+word);
			}
		}
		
		System.out.println(sb.toString());
		
		
		
		
		
		
		

	}

}
