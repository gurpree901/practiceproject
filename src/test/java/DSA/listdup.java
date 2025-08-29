package DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class listdup {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		list.add("aman");
		list.add("guru");
		list.add("aha");
		list.add("aman");
		
		Set<String > set=new HashSet(list);
		List<String> unique=new ArrayList(set);
		
		System.out.println(" "+unique);

	}

}
