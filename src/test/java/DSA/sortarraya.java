package DSA;

public class sortarraya {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,6,5,4};
		
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
		
		for(int num:a)
		{
			System.out.println(" "+num);
		}

	}

}
