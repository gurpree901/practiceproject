package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mostfreq {

	public static void main(String[] args) {
		
		int a[]= {1,2,32,2,2,2,2,4,5};
		
		Map<Integer,Integer> map=new HashMap();
		
		for(int num:a)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		System.out.println(map);
		
		int ele=a[0];
		int freq=0;
		
		for(Entry<Integer, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>freq)
			{
				ele=entry.getKey();
				freq=entry.getValue();
				
			}
		}
		
		System.out.println(""+ele);
		System.out.println(" "+freq);

	}

}
