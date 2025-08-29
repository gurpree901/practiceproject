package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mostfreqah {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,3,3,1};
		
		Map<Integer,Integer> map=new HashMap();
		
		for(int num:a)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		System.out.println(map);
		
		int freqele=a[0];
		int frequancy=0;
		
		for(Entry<Integer, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>freqele)
			{
				freqele=entry.getKey();
				frequancy=entry.getValue();
			}
		}
		
		System.out.println(" "+freqele);
		

	}

}
