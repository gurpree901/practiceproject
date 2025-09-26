package DSA;

public class negetivesorthss {

	public static void main(String[] args) {
		
		int a[]= {-8,-7,-6 ,1,2,3,4 };
		
		int n=a.length;
		
		int left=0;
		int right=n-1;
		int index=n-1;
		
		int res[]=new int[n];
		
		while(left<=right)
		{
			int leftarray=a[left]*a[left];
			int rightarray=a[right]*a[right];
			
			if(leftarray>rightarray)
			{
				res[index--]=leftarray;
				left++;
			}
			else
			{
				res[index--]=rightarray;
				right--;
			}
		}
		
		for(int num:res)
		{
			System.out.println(" "+num);
		}

	}

}
