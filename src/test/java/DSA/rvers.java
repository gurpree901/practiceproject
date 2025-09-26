package DSA;

public class rvers {

	public static void main(String[] args) {
		
		String str="WelcomeAutomation";
		
		String sub=str.substring(7, 17);
		String rev=new StringBuilder(sub).reverse().toString();
		
		String reuslt=str.substring(0, 7)+rev;
		System.out.println(reuslt);

	}

}
