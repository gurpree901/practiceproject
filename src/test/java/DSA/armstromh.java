package DSA;

import java.util.Scanner;

public class armstromh {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum=0;
		
		int orignal=num;
		
		int digits=String.valueOf(num).length();
		
		while(num>0)
		{
		   int digit= num%10;
		   sum+=Math.pow(digit,digits );
		   num=num/10;
		}
		
		if(sum==orignal)
		{
			System.out.println("armstrong number"+orignal);
		}
		else
		{
			System.out.println("not ");
		}

	}

}
