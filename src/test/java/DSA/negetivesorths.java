package DSA;

public class negetivesorths {

	public static void main(String[] args) {
		
		int a[]= {-8,-3,-2,0,1,2,39};
		
		int n=a.length;
		int left=0;
		int right=n-1;
		int index=n-1;
		
		int result[]=new int [n];
		
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
			System.out.println(" "+num);
		}

	}

}
