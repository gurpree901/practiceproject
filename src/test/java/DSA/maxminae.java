package DSA;

public class maxminae {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println(" "+a[i]);
		}
		
		for(int i=a.length-1;i>0;i--)
		{
			System.out.println(" "+a[i]);
		}

	}

}
