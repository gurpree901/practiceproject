package DSA;

public class rotations {

	public static void main(String[] args) {
		
		String str="abcd";
		String str1="bcda";
		
		if(str.length()==str1.length() && (str+str1).contains(str1))
		{
			System.out.println(" roation ");
		}
		else
		{
			System.out.println(" no");
		}

	}

}
