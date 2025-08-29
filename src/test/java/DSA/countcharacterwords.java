package DSA;

import java.util.HashMap;
import java.util.Map;

public class countcharacterwords {

	public static void main(String[] args) {
		
		String str = "automation testing";
		
		String clean=str.replaceAll(" ", "");
		Map<Character,Integer> map=new HashMap();
		
		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(map);
		
		

	}

}
