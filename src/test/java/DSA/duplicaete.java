package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplicaete {

	public static void main(String[] args) {
		
		String str="aman singh aman hs";
		
		String[] words=str.split(" ");
		
		Set<String> set=new HashSet();
		StringBuilder sb=new StringBuilder();
		
		for(String word:words)
		{
			if(set.add(word))
			{
				sb.append(word);
			}
		}
		
		System.out.println(sb.toString().trim());

	}

}
