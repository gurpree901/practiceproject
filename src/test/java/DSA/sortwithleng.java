package DSA;

public class sortwithleng {

	public static void main(String[] args) {
		
		String[] str= {"aman","amanan","aj","jaj"};
		
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
		
		for(String st:str)
		{
			System.out.println(" "+st)	;
			}
	}

}
