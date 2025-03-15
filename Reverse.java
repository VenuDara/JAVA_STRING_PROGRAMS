package Strings;

import java.util.Scanner;

public class Reverse {

	// 9. Reverse first word to last and last word to first
    public static void reverseWords(String str) {
        String[] words = str.split("\\s+");
        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;
        String result = String.join(" ", words);
        System.out.println("String after reversing first and last words: " + result);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        reverseWords(str);
        sc.close();
    }
}
