package DSA;

public class sumofstr {

	public static void main(String[] args) {
		
		String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
		
		int sum=0;
	     for(String word:array)
	     {
	    	 if(word.matches("\\d+"))
	    	 {
	    		int num= Integer.parseInt(word);
	    		
	    		sum+=num;
	    	 }
	     }
	     
	     System.out.println(" "+sum);

	}

}
