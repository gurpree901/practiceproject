package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class duplicateintege {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,2,1,3,4,5};
		
		Map<Integer,Integer> map=new HashMap();
		
		for(int num:a)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		System.out.println(" "+map);
		
		for(Entry<Integer, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(" "+entry.getKey());
			}
			
		}

	}

}


