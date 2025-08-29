package DSA;

public class negetivesortga {

	public static void main(String[] args) {
		
		int a[]= {-7,-3,-2,0,1,2,3,4};
		
		
		int n=a.length;
		int left=0;
		int right=n-1;
		int index=n-1;
		
		int result[]=new int[n];
		
		while(left<=right)
		{
			int leftarray=a[left]*a[left];
			int rightarray=a[right]*a[right];
			
			if(leftarray>rightarray)
			{
				result[index--]=leftarray;
				left++;
				
				
				
			}
			else
			{
				result[index--]=rightarray;
				right--;
			}
		}
		
		for(int num:result)
		{
			System.out.println(num);
		}
			
			

	}

}
