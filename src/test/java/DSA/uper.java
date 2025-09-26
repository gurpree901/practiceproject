package DSA;

public class uper {

	public static void main(String[] args) {
		
		String str="welocmet to ";
		
		String[] words=str.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for(String word:words)
		{
			sb.append(Character.isUpperCase(word.charAt(0)));
			sb.append(word.substring(1));
			sb.append(" ");
		}
		
		

	}

}
