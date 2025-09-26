package DSA;

public class armstronggds {

	public static void main(String[] args) {
		
		int num=1533;
		int temp=num;
		
		int sum=0;
		
		while(num>0)
		{
			int d=num%10;
			sum+=d*d*d;
			num=num/10;
			
			
		}
		
		System.out.println(sum==temp?"armstrong":"not");
		
		
			
			

	}

}
