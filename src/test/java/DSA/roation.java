package DSA;

public class roation {

	public static void main(String[] args) {
		
		String str="abcd";
		String str1="bcda";
		
		if(str.length()==str1.length() && (str+str1).contains(str1))
		{
			System.out.println(" rotaion");
		}
		else
		{
			System.out.println("not");
		}

	}

}
