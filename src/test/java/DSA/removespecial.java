package DSA;

public class removespecial {

	public static void main(String[] args) {
		
		String str="abc&$%%cdd";
		
		String clean=str.replaceAll("[a-zA-Z0-9]", ""
				+ "");
		
		System.out.println(" "+clean);

	}

}
