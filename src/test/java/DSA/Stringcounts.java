package DSA;

import java.util.HashMap;
import java.util.Map;

public class Stringcounts {

	public static void main(String[] args) {
		
		String str="welocme to java hah";
		
		String[] words=str.split(" ");
		
		Map<String,Integer> map=new HashMap();
		
		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
		System.out.println(" "+map);

	}

}
