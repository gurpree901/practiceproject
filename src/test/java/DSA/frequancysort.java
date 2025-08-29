package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class frequancysort {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,5,4,6,5,3,2,5};
		
		Map<Integer,Integer> map=new HashMap();
		
		for(int num:a)
		{
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		System.out.println("frequancy of each number"+map);
		
		List<Integer> list=new ArrayList();
		
		for(int num:a)
		{
			System.out.println("array convert to list "+num);
			
		}
		
		Collections.sort(list, (a, b) ->
		{
			
		}
		
		

	}

}
