package day1;

public class overloading {
	
	int a =10;
	int b=20;
	
	
	void m1(int a,int b)
	{
		System.out.println();
	}
	
	void m2(double x,int y)
	{
		System.out.println(x+y);
	}
	
	void m3(int a,double y)
	{
		System.out.println(a+y);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		overloading ov=new overloading();
		
		ov.m2(22.3, 3);
		
		

	}

}
