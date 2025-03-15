package Strings;

import java.util.Scanner;

public class CharOccurance {

	// 3. Occurrence of a character
    public static void charOccurrence(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Character '" + ch + "' occurs " + count + " times.");
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.print("Enter a character: ");
    char ch = sc.next().charAt(0);
    charOccurrence(str, ch);
    sc.close();
}
}
