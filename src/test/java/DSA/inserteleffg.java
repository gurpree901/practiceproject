package DSA;

public class inserteleffg {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int insertele=34;
		int pos=3;
		
		int newarray[]=new int[a.length+1];
		
		for(int i=0;i<pos;i++)
		{
			newarray[i]=a[i];
		}
		
		newarray[pos]=insertele;
		
		for(int i=pos;i<a.length;i++)
		{
			newarray[i+1]=a[i];
		}
		
		for(int num:newarray)
		{
			System.out.println(" "+num);
		}

	}

}
