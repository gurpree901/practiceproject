package DSA;

import java.util.Arrays;

public class anagramhd {

	public static void main(String[] args) {
		
		String str="listen";
		String str1="silent";
		
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		
		Arrays.sort(ch);
	    Arrays.sort(ch1);
	    
	    System.out.println(Arrays.equals(ch, ch1)?"anagram":"not anagram");

	}

}
