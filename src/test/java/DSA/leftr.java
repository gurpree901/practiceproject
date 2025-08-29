package DSA;

public class leftr {

	public static void main(String[] args) {
		
		int a[]= {1,23,4,5,6};
		
		int first=a[0];
		
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		a[a.length-1]=first;
		
		for(int num:a)
		{
			System.out.println(" "+num);
		}

	}

}
