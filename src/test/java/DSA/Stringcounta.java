package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Stringcounta {

	public static void main(String[] args) {
		
		String str="welcome to java to";
		
		String[] words=str.split(" ");
		
		Map<String,Integer> map=new HashMap();
		
		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
		System.out.println(" "+map);
		
		for(Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(" "+entry.getKey());
			}
		}

	}

}
