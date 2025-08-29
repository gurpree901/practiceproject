package DSA;

public class duplicatearr {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,1,4,6};
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(" duplicate found"+a[i]);
					flag=true;
					break;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println(" not found");
		}

	}

}
