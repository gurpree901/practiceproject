package DSA;

public class reversesubst {

	public static void main(String[] args) {
		
		String str = "WelcomeAutomation";
		
		String sub=str.substring(7, 17);
		String rev=new StringBuilder(sub).reverse().toString();
	String res=	str.substring(0, 7)+rev;
	System.out.println(res);

	}

}
