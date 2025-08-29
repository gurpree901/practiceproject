package DSA;

import com.beust.ah.A;

public class pairsum {

	public static void main(int arr[],int sum) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[i]==sum)
				{
					System.out.println(arr[i]+" +" +arr[j]+" ="+sum);
				}
			}
		}
		


	}

}
