package DSA;

public class replacr {

	public static void main(String[] args) {
		
		String str="hwllo%%#^jj";
		
		String clean=str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(" "+clean);

	}

}
