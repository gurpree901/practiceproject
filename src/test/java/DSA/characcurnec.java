package DSA;

import java.util.HashSet;
import java.util.Set;

public class characcurnec {

	public static void main(String[] args) {
		
		String str="gurpreeet";
		
		Set<Character> set=new HashSet();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(set.add(ch))
			{
				sb.append(ch);
			}
			
			
		}
		
		System.out.println(" "+sb.toString());

	}

}
