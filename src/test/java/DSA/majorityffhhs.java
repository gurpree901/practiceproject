package DSA;

public class majorityffhhs {

	public static void main(String[] args) {
		
		int a[]= {1,2,2,2,2,4};
		
		int count=0;
		int candidate=0;
		
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
