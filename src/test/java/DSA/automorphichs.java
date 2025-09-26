package DSA;

import java.util.Scanner;

public class automorphichs {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sq=num*num;
		
		if(String.valueOf(sq).endsWith(String.valueOf(num)))
		{
			System.out.println("automorphic number:"+num);
		}
		else
		{
			System.out.println("not ");
		}

	}

}
