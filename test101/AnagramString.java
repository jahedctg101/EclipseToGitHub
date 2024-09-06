package Interview_Test;

import java.util.Arrays;



public class AnagramString {

	public static void main(String[] args) {
		// Two Strings are Anagram
		
		String s1 ="Listen";
		String s2 ="Silent";
		
		char[] arr1=s1.toLowerCase().toCharArray();
		char[] arr2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Both Strings are Anagram");
		}
		else {
			System.out.println("Both Strings are not Anagram");
		}

	}

}
