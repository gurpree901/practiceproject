package DSA;

public class longestlenge {

	public static void main(String[] args) {
		
	   String str="welcome to java";
	   
	   String[] words=str.split(" ");
	   
	   String longest=" ";
	   for(String word:words)
	   {
		   if(word.length()>longest.length())
		   {
			   longest=word;
		   }
	   }
	   

	}

}
