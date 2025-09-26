package DSA;

import java.util.HashMap;
import java.util.Map;

public class countstring {

	public static void main(String[] args) {
		
		String str="wleocme to java bf";
		
		String[] words=str.split(" ");
		
		Map<String,Integer> map=new HashMap();
		
		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
		System.out.println(map);

	}

}
