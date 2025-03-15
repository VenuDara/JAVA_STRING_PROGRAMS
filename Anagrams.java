package Strings;

import java.util.Scanner;

public class Anagrams {

	// 10. Check if two strings are anagrams
	public static void checkAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("The strings are not anagrams.");
			return;
		}
		int[] count = new int[256];
		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		for (int i : count) {
			if (i != 0) {
				System.out.println("The strings are not anagrams.");
				return;
			}
		}
		System.out.println("The strings are anagrams.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = sc.nextLine();
		checkAnagram(str1, str2);
		sc.close();
	}
}
