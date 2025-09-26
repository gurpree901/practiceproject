package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class dd {

	public static void main(String[] args) {
		
		
		String[] str= {"aman","java","jaj","kak","java","kk"};
		
		Map<String,Integer> map=new HashMap();
		
		for(String st:str)
		{
			map.put(st, map.getOrDefault(st, 0)+1);
		}
		System.out.println(map);
		
		for(Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println("key:"+entry.getKey()+" value"+entry.getValue());
			}
		}

	}

}
