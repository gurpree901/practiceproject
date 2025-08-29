package DSA;

public class isrortaion {

	public static void main(String[] args) {
		
		String str="abcd";
		String str1="bcda9";
		
		if(str.length()==str1.length() && (str+str1).contains(str1))
		{
			System.out.println(" rotation ");
		}
		else
		{
			System.out.println("not rotation");
		}

	}

}
