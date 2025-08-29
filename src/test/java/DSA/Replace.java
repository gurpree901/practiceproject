package DSA;

public class Replace {

	public static void main(String[] args) {
		
		String str="aabb&&*@*j";
		
		String cleans=str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(" "+cleans);

	}

}
