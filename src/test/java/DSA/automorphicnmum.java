package DSA;

import java.util.Scanner;

public class automorphicnmum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numer");
		
		int num=sc.nextInt();
		int sq=num*num;
		
		if(String.valueOf(sq).endsWith(String.valueOf(num)))
		{
			System.out.println(" automoprphic number");
		}
		else
		{
			System.out.println("not");
		}

	}

}
