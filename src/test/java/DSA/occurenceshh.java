package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class occurenceshh {

	public static void main(String[] args) {
		
		String str="aabbccdd";
		
		Map<Character,Integer> map=new HashMap();
		
		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(" "+map);
		
		for(Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(" "+entry.getKey());
				break;
			}
		}
		

	}

}
