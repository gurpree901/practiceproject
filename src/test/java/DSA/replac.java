package DSA;

public class replac {

	public static void main(String[] args) {
		
		String str = "Selenium@2025#Testing!";
		
		String clean=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(" "+clean);

	}

}
