package DSA;

import java.util.Scanner;

public class armstrongsd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		
		
		int num=sc.nextInt();
		int orignal=num;
		int digits=String.valueOf(num).length();
		
		while(num>0)
		{
			int digit=num%10;
			int sum=(int) Math.pow(digits, digit);
			
			num=num/10;
		}
		
		if(orignal==num) {
			
			System.out.println("armstrong number"+orignal);
		}
		else
		{
			System.out.println("no:"+orignal);
		}

	}

}
