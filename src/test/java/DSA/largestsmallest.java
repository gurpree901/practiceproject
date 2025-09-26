package DSA;

public class largestsmallest {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		
		int largest=a[0];
		
		for(int num:a)
		{
			if(num<largest)
			{
				largest=num;
			}
		}
		
		System.out.println(" "+largest);

	}

}
