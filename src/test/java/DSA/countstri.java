package DSA;

import java.util.HashMap;
import java.util.Map;

public class countstri {

	public static void main(String[] args) {
		
		String [] str= {"aman","hh","kkak","jajaja"};
		
		Map<String,Integer> map=new HashMap();
		
		for(String words:str)
		{
			map.put(words, map.getOrDefault(words, 0)+1);
		}
		
		System.out.println(map);

	}

}
