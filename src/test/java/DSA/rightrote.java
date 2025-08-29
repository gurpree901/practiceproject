package DSA;

public class rightrote {

	public static void main(String[] args) {
		
		int a[]= {5,4,3,2,1};
		
		int last=a[a.length-1];
		
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		
		a[0]=last;
		
		for(int num:a)
		{
			System.out.println(" "+num);
		}

	}

}
