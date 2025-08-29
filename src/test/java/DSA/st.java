package DSA;

public class st {

	public static void main(String[] args) {
		
		 String[] arr = {"banana", "apple", "kiwi", "mango", "orange"};
		 
		 for(int i=0;i<arr.length-1;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i].length()>arr[j].length())
				 {
					 String temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 
		 for(String st:arr)
		 {
			 System.out.println(" "+st);
		 }

	}

}
