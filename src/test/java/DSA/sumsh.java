package DSA;

public class sumsh {

	public static int main(String[] args) {
		
	    String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
	    
	    int sum=0;
	    
	    for(String ele:array)
	    {
	    	try {
	    	int nu=Integer.parseInt(ele);
	    	sum+=nu;

	    	}
	    	catch(NumberFormatException e)
	    	{
		    	

	    	}
	    	return sum;
	    	
	
	    }
		return sum;
		
		
		
	}

}
