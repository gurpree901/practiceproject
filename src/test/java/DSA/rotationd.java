package DSA;

public class rotationd {

	public static void main(String[] args) {
		
		String str="abcd";
		String str1="bcda";
		
		if(str.length()==str1.length() && (str+str1).contains(str))
		{
			System.out.println("roation of each other");
		}
		else
		{
			System.out.println("no");
			
		}

	}

}
