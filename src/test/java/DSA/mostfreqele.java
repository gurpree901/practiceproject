package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mostfreqele {

	public static void main(String[] args) {
		
		int a[]= {1,2,2,1,2,2,2,3,3,3,2,4,5};
		
		Map<Integer,Integer> map=new HashMap();
		
		for(int num:a)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		int freqele=a[0];
		int maxfreq=0;
		
		for(Entry<Integer, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>maxfreq)
			{
				freqele=entry.getKey();
				maxfreq=entry.getValue();
			}
		}
		
		System.out.println(" "+freqele);
		System.out.println(" "+maxfreq);
		
		

	}

}
