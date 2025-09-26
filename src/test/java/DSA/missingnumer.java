package DSA;

public class missingnumer {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5,6};
		
         int sum=0;
         for(int num:a)
         {
        	 sum=sum+num;
         }
         System.out.println(" "+sum);
         
         int sum1=0;
         
         for(int i=1;i<=6;i++)
         {
        	 sum1=sum1+i;
         }
         
         System.out.println("missing numer"+(sum1-sum));
       
       

	}

}
