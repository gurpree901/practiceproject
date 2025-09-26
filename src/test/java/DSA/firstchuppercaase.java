package DSA;

public class firstchuppercaase {

	public static void main(String[] args) {
		
		String str="welcome to jaav";
		
		String[] words=str.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		for(String word:words)
		{
			if(word.length()>0)
			{
				sb.append(Character.toUpperCase(word.charAt(0)))
				.append(word.substring(1))
				.append(" ");
				
				
			}
		}
		
		System.out.println(" "+sb.toString().trim());
		
				

	}

}
