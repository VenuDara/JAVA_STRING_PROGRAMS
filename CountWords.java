package Strings;

import java.util.Scanner;

public class CountWords {

	 // 8. Count the words in the given string
    public static void countWords(String str) {
        String[] words = str.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
        System.out.println(words.toString());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        countWords(str);
        
        sc.close();
    }
}
