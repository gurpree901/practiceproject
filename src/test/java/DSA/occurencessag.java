package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class occurencessag {

	public static void main(String[] args) {
		
		int a[]= {1,2,2,2,23,34,4,5,2};
		
		Map<Integer,Integer> map=new HashMap();
		
		for(int num:a)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		int freqele=a[0];
		int freq=0;
		
		for(Entry<Integer, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>freq)
			{
				freqele=entry.getKey();
				freq=entry.getValue();
			}
		}
		
		System.out.println(" "+freqele);
		System.out.println(" "+freq); 

	}

}
