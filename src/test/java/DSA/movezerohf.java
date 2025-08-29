package DSA;

public class movezerohf {

	public static void main(String[] args) {
		
		int a[]= {1,2,0,3,4,0,5};
		
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
