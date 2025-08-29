package DSA;

public class increasingleng {

	public static void main(String[] args) {
		
		String [] str= {"aman","gururu","kkd"};
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()<str[j].length())
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		
		for(String num:str)
		{
			System.out.println(" "+num);
		}

	}

}
