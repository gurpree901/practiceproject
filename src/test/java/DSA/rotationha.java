package DSA;

public class rotationha {

	public static void main(String[] args) {
		
		String str="abcd";
		String str1="dcba";
		
		if(str.length()==str1.length() && (str1+str).contains(str1))
		{
			System.out.println("rotation");
		}
		else
		{
			System.out.println("not rotation");
		}

	}

}
