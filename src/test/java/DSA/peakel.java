package DSA;

public class peakel {

	public static void main(String[] args) {
		
		int a[]= {1,23,4,4,444,2};
		
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>a[i-1] && a[i]>a[i+1])
			{
				System.out.println(" "+a[i]);
			}
		}

	}

}
