package DSA;

public class armstrongwh {

	public static void main(String[] args) {
		
		int num=153;
		int sum=0;
		
		int temp=num;
		
		while(num>0)
		{
			int r=temp%10;
			sum+=r*r*r;
			temp=temp/10;
		}
		
		System.out.println(sum==num?"armstrong":"not ");

	}

}
