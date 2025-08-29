package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class wordcunt {

	public static void main(String[] args) {
		
		String str="welcome to java";
		
		String[] words=str.split(" ");
		Map<String,Integer> map=new HashMap();
		
		for(String word:words)
		{
			if(map.containsKey(word))
			{
				map.put(word, map.getOrDefault(word, 0)+1);
			}
			else
			{
				map.put(word, 1);
			}
		}
		
		for(Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"-> "+entry.getValue());
		}
				
				

	}

}
