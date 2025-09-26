package DSA;

public class revr {

	public static void main(String[] args) {
		
		String str="welocme to java";
		
		String[] words=str.split(" ");
		String rev=" ";
		
		for(int i=words.length-1;i>=0;i--)
		{
			rev+=words[i]+" ";
		}
		
		System.out.println(" "+rev);

	}

}
