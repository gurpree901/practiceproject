package day1;

public class duplicatearray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,1,4};
		
		int search_ele=3;
		boolean status=false;
		
		for(int i=0;i<=5;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("elemnt found:"+i);
				boolean status1=true;
				break;
			 
				
				
			}
			
			
		
			
		}
		if(status=false)
		{
			System.out.println("element not found");
		}
		

	}

}
