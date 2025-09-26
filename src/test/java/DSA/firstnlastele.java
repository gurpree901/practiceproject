package DSA;

import java.util.ArrayList;
import java.util.List;

public class firstnlastele {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		
		list.add("aman");
		list.add("kk");
		list.add("kls");
		list.add("l");
		
		System.out.println("size"+list.size());
		
		String first=list.get(0);
		String last=list.get(list.size()-1);
		
		System.out.println(" first"+first);
		System.out.println("last"+last);
		
	}

	

}
