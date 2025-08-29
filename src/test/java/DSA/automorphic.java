
package DSA;

import java.util.Scanner;

public class automorphic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		
		int num=sc.nextInt();
		int sq=num*num;
		
		if(String.valueOf(sq).endsWith(String.valueOf(num)))
				{
			        System.out.println("automorphic number"+sq);
			
				}
		else
		{
			System.out.println("not automorphic");
		}
				
			
				
				
			
				

	}

}
