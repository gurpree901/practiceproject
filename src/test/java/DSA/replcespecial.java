package DSA;

public class replcespecial {

	public static void main(String[] args) {
		
		String str="aman@#$singh";
		
		String clean=str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(" "+clean);
		
		

	}

}
