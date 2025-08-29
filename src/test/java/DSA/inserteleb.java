package DSA;

public class inserteleb {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int position=4;
		int insertele=44;
		
		int newarray[]=new int [a.length+1];
		
		for(int i=0;i<position;i++)
		{
			newarray[i]=a[i];
		}
		
		newarray[position]=insertele;
		
		for(int i=position;i<a.length;i++)
		{
			newarray[i+1]=a[i];
		}
		
		for(int n:newarray)
		{
			System.out.println(" "+n);
		}

	}

}
