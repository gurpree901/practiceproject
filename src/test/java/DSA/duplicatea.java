package DSA;

import java.util.HashSet;
import java.util.Set;

public class duplicatea {

	public static void main(String[] args) {
		
		String[] str= {"aman","java","guru","aman"};
		
		Set<String> set=new HashSet();
		
		boolean flag=false;
		for(int i=0;i<str.length;i++)
		{
			if(!set.add(str[i]))
			{
				System.out.println("duplicate found"+i);
				flag=true;
			}
		}

	}

}
