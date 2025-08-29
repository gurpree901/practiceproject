package DSA;

public class removespecialcharacter {

	public static void main(String[] args) {
		
		String str="He@llo! Wo#rld$";
		
		String clean=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("cleaned string:"+clean);

	}

}
