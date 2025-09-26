package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplicatrsb {

	public static void main(String[] args) {
		
		String str="amansinghhh";
		
		Set<Character> set=new HashSet();
		
		for(char ch:str.toCharArray())
		{
			if(!set.add(ch))
			{
				System.out.println("duplicates"+ch);
			}
		}

	}

}
