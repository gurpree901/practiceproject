package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class countup {

	public static void main(String[] args) {
		
		 int[] arr = {1, 2, 3, 4, 1, 4, 6, 2, 2};
		 
		 Map<Integer,Integer> map=new HashMap();
		 
		 for(int num:arr)
		 {
			 if(map.containsKey(num))
			 {
				 map.put(num, map.get(num)+1);
			 }
			 else
			 {
				 map.put(num, 1);
			 }
		 }
		 
		 System.out.println(" duplicate elemnt count");
		 for(Entry<Integer, Integer> entry:map.entrySet())
		 {
			 if(entry.getValue()>1)
			 {
				 System.out.println(entry.getKey()+" accurs"+entry.getValue()+" fre");
			 }
		 }

	}

}
