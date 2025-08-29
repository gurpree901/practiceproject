package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplicatest {

	public static void main(String[] args) {
		
		String str="amansingh";
		
		Set<Character> set=new HashSet();
		StringBuilder sb=new StringBuilder();
		
		for(char ch:str.toCharArray())
		{
			if(set.add(ch))
			{
				sb.append(ch);
			}
		}
		
		System.out.println(" "+sb.toString());

	}

}
