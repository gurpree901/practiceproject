package DSA;

public class armsor {

	public static void main(String[] args) {
		
		int num=153;
		
		int orignal=num;
		int sum=0;
		
		int digits=String.valueOf(num).length();
		
		while(num>0)
		{
			int digit=num%10;
			sum+=Math.pow(digit, digits);
			num=num/10;
		}
		
		if(sum==orignal)
		{
			System.out.println("armstrong numer"+orignal);
		}
		else
		{
			System.out.println("not");
		}
	}

}
