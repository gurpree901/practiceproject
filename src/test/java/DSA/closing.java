package DSA;

public class closing {

	public static void main(String[] args) {
		
		 String str = "((a+b)) + (c*(d+e)))";
		 
		 int count=0;
		 
		 for(char ch:str.toCharArray())
		 {
			 if(ch==')')
			 count++;
		 }  
		 
		 System.out.println(" "+count);

	}

}
