package DSA;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		int orignal=num;
		int sum=0;
		
		int digits=String.valueOf(num).length();
		
		while(num>0)
		{
			int digit=num%10;
			sum+=Math.pow(digit, digits);
			num/=10;
			
		}
		
		

	}

}
