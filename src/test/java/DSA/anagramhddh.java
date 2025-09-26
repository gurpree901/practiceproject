package DSA;

import java.util.Arrays;

public class anagramhddh {

	public static void main(String[] args) {
		
		String str="silent";
		String str1="listen4";
		
		char [] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		System.out.println(Arrays.equals(ch, ch1)?"anagram":"not");

	}

}
