package DSA;

import java.util.Arrays;

public class equalss {

	public static void main(String[] args) {
		
	    int a[]= {1,2,3,4};
	    int a1[]= {1,2,3,4};
	    
	    boolean status=Arrays.equals(a, a1);
	    if(status==true)
	    {
	    	System.out.println("arrays are equal");
	    }
	    else
	    {
	    	System.out.println("array not equal");
	    	
	    }
	    boolean flag=false;
	    if(a.length==a1.length)
	    {
	    	for(int i=0;i<a.length;i++)
	    	{
	    		if(a[i]==a1[i])
	    		{
	    			System.out.println("equal");
	    			flag=true;
	    			break;
	    			
	    		}
	    	}
	    }
	    else
	    {
	    	System.out.println("not abe to found");
	    }

	}

}
