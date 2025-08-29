package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplicatesg {

	public static void main(String[] args) {
		
		String str="welocme to java to ";
		
		String[] words=str.split(" ");
		
		String prev="";
		Set<String> set=new HashSet();
		StringBuilder sb=new StringBuilder();
		
		for(String word:words)
		{
			if(set.add(word))
			{
				
				sb.append(word).append(" ");
				prev=word;
				
				
			}
		}
		
		System.out.println(" "+sb.toString().trim());

	}

}
