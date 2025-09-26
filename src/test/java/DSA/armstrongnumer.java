package DSA;

public class armstrongnumer {

	public static void main(String[] args) {
		
		int num=153;
		int orignal=num;
		
		int sum=0;
		int digits=String.valueOf(num).length();
		
		while(num>0)
		{
			int digit=num%10;
			sum+=Math.pow(digits, digit);
			num=num/10;
		}
		
		if(orignal==num)
		{
			System.out.println("armstrong number:"+orignal);
		}
		else
		{
			System.out.println("not ");
		}
			
			
		
		
		
		
		
	}

}
