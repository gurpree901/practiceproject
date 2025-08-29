package DSA;

public class specialsymbols {

	public static void main(String[] args) {
		
		String str= "He@llo! Wo#rld$";
		String cl=str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(" "+cl);

	}

}
