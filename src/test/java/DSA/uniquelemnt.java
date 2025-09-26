package DSA;

public class uniquelemnt {

	public static void main(String[] args) {
		
		Object[] arr = {1, '@', 2, '#', 3};
		
		int sum=0;
		for(Object a:arr)
		{
			if(a instanceof Integer)
			{
				sum+=(Integer) a;
			}
		}
		
		System.out.println(" "+sum);

	}

}
