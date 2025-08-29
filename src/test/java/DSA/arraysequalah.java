package DSA;

public class arraysequalah {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,5,4};
		int a1[]= {6,5,7,8,9};
		
		
		if(a.length==a1.length)
		{
			boolean flag=false;
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						System.out.println("equal");
						flag=true;
					}
				}
			}
			
			if(flag==true)
			{
				System.out.println("not equal");
			}
			
			

		}

		}
		

}
