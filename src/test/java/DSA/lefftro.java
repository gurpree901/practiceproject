package DSA;

public class lefftro {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
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
