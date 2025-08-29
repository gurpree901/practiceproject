package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class charactercount {

	public static void main(String[] args) {
		
		String str="amansinghi";
		
		Map<Character,Integer> map=new HashMap();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
		
		for(Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
				break;
			}
		}

	}

}
