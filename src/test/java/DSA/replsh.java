package DSA;

public class replsh {

	public static void main(String[] args) {
		
		String str="amans#@#$$singh";
		
		String rep=str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(" "+rep);

	}

}
