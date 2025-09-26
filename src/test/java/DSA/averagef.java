package DSA;

public class averagef {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int sum=0;
		
		for(int num:a) {
			
			sum=sum+num;
		}
		System.out.println(" sum "
				+sum);
		
		int avg=sum/a.length;
		System.out.println(" avergae"+avg);

	}

}
