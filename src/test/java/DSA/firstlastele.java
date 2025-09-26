package DSA;

import java.util.ArrayList;
import java.util.List;

public class firstlastele {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		
		list.add("aman");
		list.add("guru");
		list.add("kk");
		list.add("singh");
		list.add("kks");
		
		String first=list.get(0);
		String last=list.get(list.size()-1);
		
		System.out.println(" "+first);
		System.out.println(" "+last);

	}

}
