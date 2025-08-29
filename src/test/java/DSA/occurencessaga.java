package DSA;

import java.util.HashMap;
import java.util.Map;

public class occurencessaga {

	public static void main(String[] args) {
		
		String str="amansingh";
		
		Map<Character,Integer> map=new HashMap();
		
		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(map);
		

	}

}
