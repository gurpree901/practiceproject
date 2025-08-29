package DSA;

public class arraysequal {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int a1[]= {1,2,3,4,5};
		
		boolean flag=false;
		if(a.length==a1.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==a1[i])
				{
					System.out.println("Arrays are equal");
					flag=true;
					break;
							
					
				}
			}
		}
		else
		{
			System.out.println("not able to found");
		}

	}

}
