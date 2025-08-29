package DSA;

public class linearsearch {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int search_ele=3;
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_ele)
			{
				System.out.println("elemnt found"+i);
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println("not found");
		}

	}

}
