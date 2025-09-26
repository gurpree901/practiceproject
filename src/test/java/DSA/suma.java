package DSA;

public class suma {

	public static void main(String[] args) {
		Object[] arr = {10, 20, '@', 5, '#', 15, '$'};
		
		int sum=0;
		for(Object ob:arr)
		{
			if(ob instanceof Integer)
			{
				sum+=(Integer)ob;
			}
		}
		
		System.out.println(" "+sum);
	}

}
