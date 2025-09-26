package DSA;

public class armstrongr {

	public static void main(String[] args) {
		
		int num=153;
		
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			int d=num%10;
			sum+=d*d*d;
			num=num/10;
		}
		
		System.out.println(sum==temp?"armstrong":"not");

	}

}
