package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplicategag {

	public static void main(String[] args) {
		
		
	     String str="amansingh";
	     
	     Set<Character> set=new HashSet();
	     
	     for(char ch:str.toCharArray())
	     {
	    	 if(!set.add(ch))
	    	 {
	    		 System.out.println(" duplicate character:"+ch);
	    	 }
	     }

	}

}
