package DSA;

public class majorityb {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,3,3,3,4};
		
		int count=1; int candidate=0;
		
		for(int num:a)
		{
			if(count==0)
			{
				candidate=num;
			}
			count+=(num==candidate?1:-1);
		}
		
		System.out.println(" "+candidate);

	}

}
