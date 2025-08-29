package DSA;

import java.util.Scanner;

public class automic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		
		int num=sc.nextInt();
		int square=num*num;
		
		if(String.valueOf(square).endsWith(String.valueOf(num)))
		{
			System.out.println("automorphic: "+num);
		}
		else
		{
			System.out.println("not auto:"+num);
		}
		
		
		

	}

}
