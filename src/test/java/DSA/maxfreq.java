package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class maxfreq {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,5,5,6,6,6,6};
		
		Map<Integer,Integer> map=new HashMap();
		
		for(int num:a)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
			
		}
		
		System.out.println(" "+map);
		
		int freqele=a[0];
		int freqancy=0;
		
		for(Entry<Integer, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>freqancy)
			{
				freqele=entry.getKey();
				freqancy=entry.getValue();
			}
		}
		
		System.out.println(" "+freqele);
		System.out.println(" "+freqancy);
		
		

	}

}
