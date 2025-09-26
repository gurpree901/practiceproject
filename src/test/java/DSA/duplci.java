package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplci {

	public static void main(String[] args) { 
		
		String str="aman singh ajj aman";
		
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
		
		System.out.println("dupicae"+sb.toString());

	}

}
