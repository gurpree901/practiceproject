package DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicatfromlist {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		
		list.add("aman");
		list.add("guru");
		list.add("hh");
		list.add("aman");
		list.add("jj");
		
		Set<String>  set=new HashSet(list);
		
		List<String> uniques=new ArrayList(set);
		System.out.println(" remve duplicates:"+uniques);
		

	}

}
