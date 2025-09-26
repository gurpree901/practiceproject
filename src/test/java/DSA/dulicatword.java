package DSA;

import java.util.HashSet;
import java.util.Set;

public class dulicatword {

	public static void main(String[] args) {
		
		String str="welocme to java to";
		
		String[] words=str.split(" ");
		Set<String> set=new HashSet();
		
		for(String word:words)
		{
			if(set.add(word))
			{
				System.out.println(" "+word);
			}
		}

	}

}
