package DSA;

public class inserteleG {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int position=3;
		
		int inserte_ele=33;
		
		int newarray[]=new int[a.length+1];
		
		for(int i=0;i<a.length;i++)
		{
			newarray[i]=a[i];
		}

		newarray[position]=inserte_ele;
		
		for(int i=position;i<a.length;i++)
		{
			newarray[i+1]=a[i];
		}
		
		for(int num:newarray)
		{
			System.out.println(" "+num);
		}
		
		
		
		

	}

}
