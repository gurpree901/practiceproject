package DSA;

public class majoritaj {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,3,3,2,4};
		
		int count=0; int candidate=0;
		
		for(int a:num)
		{
			if(count==0)
			{
				candidate=a;
			}
			count+=(a==candidate?1:-1);
		}
		
		System.out.println(" "+candidate);

	}

}
