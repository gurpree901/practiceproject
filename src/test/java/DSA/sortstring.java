package DSA;

public class sortstring {

	public static void main(String[] args) {
		
		String[] words= {"aman","jaj","gurpre","f"};
		
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].length()<words[j].length())
				{
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		
		for(String s:words)
		{
			System.out.println(" "+s);
		}
			
			

	}

}
