package DSA;

public class strinhsum {

	public static void main(String[] args) {
		
		String[] arr = {"10", "20", "@", "5", "#", "15", "$", "A", "7"};
		
		int sum=0;
		for(String a:arr)
		{
			if(a.matches("\\d+"))
			{
				sum+=Integer.parseInt(a);
			}
		}
		
		System.out.println(" sum"+sum);

	}

}
