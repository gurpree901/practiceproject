package DSA;

import java.util.HashSet;
import java.util.Set;

public class stringarryadu {

	public static void main(String[] args) {
		
		String str[]= {"aman","aja","ama","alaaaaa","aman"};
		
		/*Set<String> set=new HashSet();
		
		for(int i=0;i<str.length;i++)
		{
			if(!set.add(str[i]))
			{
				System.out.println(" duplicate found"+str[i]);
			}
		}*/
		
		
		boolean flag=false;
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()>str[j].length())
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
					
				}
			}
		}
		
		for(String s:str)
		{
			System.out.println(" "+s);
		}
		
		
	

	}

}
