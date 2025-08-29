package DSA;

public class movezerro {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,0,5,0,6};
		
		int index=0;
		
		for(int num:a)
		{
			if(num!=0)
			{
				a[index++]=num;
			}
				
				
		}
		while(index<a.length)
		{
			a[index++]=0;
		}
		
		for(int num:a)
		{
			System.out.println(" "+num);
		}

	}

}
