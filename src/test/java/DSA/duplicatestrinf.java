package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplicatestrinf {

	public static void main(String[] args) {
		
		String str="gurpreet";
		
		Set<Character> set=new HashSet();
		
		for(char ch:str.toCharArray())
		{
			if(set.add(ch))
			{
				System.out.println(" "+ch);
			}
		}

	}

}
