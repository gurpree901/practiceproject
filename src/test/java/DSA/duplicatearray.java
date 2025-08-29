package DSA;

public class duplicatearray {

	public static void main(String[] args) {
		
		String[] str= {"aman","java","kk","aman"};
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println("duplcate found:"+str[i]);
					break;
				}
			}
		}
		
		

	}

}
