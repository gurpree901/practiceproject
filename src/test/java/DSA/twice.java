package DSA;

public class twice {

	public static void main(String[] args) {
		
		String str="java";
		
		StringBuilder sb=new StringBuilder();
		
		for(char ch:str.toCharArray())
		{
			sb.append(ch).append(ch);
		}
		System.out.println(" "+sb.toString());
				

	}

}
