package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class unique {

	public static void main(String[] args) {
		
		  String[] arr = {"Selenium", "Java", "API", "Java", "Automation", "API"};
		  
		  Map<String,Integer> map=new HashMap();
		  
		  for(String st:arr)
		  {
			  map.put(st, map.getOrDefault(st, 0)+1);
		  }
		  System.out.println(" "+map);
		  
		  for(Entry<String, Integer> entry:map.entrySet())
		  {
			  if(entry.getValue()==1)
			  {
				  System.out.println(" keys"+entry.getKey()+"value"+entry.getValue());
			  }
		  }
		  
		 
	}

}
