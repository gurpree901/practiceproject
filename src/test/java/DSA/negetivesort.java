package DSA;

public class negetivesort {

	public static void main(String[] args) {
		
		int a[]= {-7,-3,0,1,2,5};
		
		int n=a.length;
		int left=0;
		int right=n-1;
		int index=n-1;
		
		int newarray[]=new int [n];
		
		while(left<=right)
		{
			int leftarray=a[left]*a[left];
			int rightarray=a[right]*a[right];
			
			if(leftarray>rightarray)
			{
				newarray[index--]=leftarray;
				left++;
			}
			else
			{
				newarray[index--]=rightarray;
				right--;
			}
		}
		
		for(int num:newarray)
		{
			System.out.println(num);
		}
		
		

	}

}
