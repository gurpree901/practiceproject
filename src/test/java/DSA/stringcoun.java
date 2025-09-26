package DSA;

import java.util.HashMap;
import java.util.Map;

public class stringcoun {

	public static void main(String[] args) {
		
		String[] words= {"aman","guru","j","guru","aman"};
		
		Map<String,Integer> map=new HashMap();
		
		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
		System.out.println(" "+map);

	}

}
