package DSA;

public class specialsymbolsdg {

	public static void main(String[] args) {
		
		String str="gurpreet555@@##singh";
		
		String clean=str.replaceAll("[^a-zA-z0-9]", "");
		
		System.out.println(" "+clean);
		

	}

}
