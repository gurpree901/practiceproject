package DSA;

public class repla {

	public static void main(String[] args) {
		
		String str="aman#@##singh";
		
		String clean=str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(" "+clean);

	}

}
