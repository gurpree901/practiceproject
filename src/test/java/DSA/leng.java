package DSA;

public class leng {

	public static void main(String[] args) {
		
		String str[]= {"aman","jj","gag","akakka"};
		
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
		
		for(String s:str)
		{
			System.out.println(" "+s);
		}

	}

}
