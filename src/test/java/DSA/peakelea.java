package DSA;

public class peakelea {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>a[i-1] && a[i]>a[i+1])
			{
				System.out.println(" peak ele"+a[i]);
			}
		}

	}

}
