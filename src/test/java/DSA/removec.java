package DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removec {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		list.add("aman");
		list.add("guru");
		list.add("aman");
		list.add("j");
		
		Set<String> set=new HashSet(list);
		List<String> uniques=new ArrayList(set);
		
		System.out.println(" "+uniques);
		

	}

}
