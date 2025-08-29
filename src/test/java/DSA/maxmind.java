package DSA;

public class maxmind {

	public static void main(String[] args) {
		
		int[] arr = {15, 2, 89, 41, 77, 3, 99, 24, 5};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=arr.length-1;i<arr.length;i++)
		{
			System.out.println(arr[i]);

		}

	}

}
