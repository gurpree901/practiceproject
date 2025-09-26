package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplicatearrya {

	public static void main(String[] args) {
		
		String arr[]= {"aman","java","kk","aman"};
		
		Set<String> set=new HashSet();
		
		boolean flag=false;
		for(String num:arr)
		{
			if(!set.add(num))
			{
				System.out.println("duplicate found"+num);
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println("not found");
		}

	}

}
