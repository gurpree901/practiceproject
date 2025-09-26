package DSA;

import java.util.HashMap;
import java.util.Map;

public class occurencesd {

	public static void main(String[] args) {
		
		
		String str="welocme to java";
		
		Map<String,Integer> map=new HashMap();
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		System.out.println(" "+map);
		
		
		
	

	}

}
