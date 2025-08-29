package DSA;

public class squaresorr {

	public static void main(String[] args) {
		
		int a[]= {-9,-8,0,1,2,6};
		
		int n=a.length;
		int left=0;
		int right=n-1;
		int index=n-1;
		
		int result[]=new int [n];
		
	while(left<=right)
	{
		int leftarray=a[left]*a[left];
		int rigtarray=a[right]*a[right];
		
		if(leftarray>rigtarray)
		{
			result[index--]=leftarray;
			left++;
		}
		else
		{
			result[index--]=rigtarray;
			right--;
		}
		
		
	}
	
	for(int num:result)
	{
		System.out.println(" "+num);
	}

	}

}
