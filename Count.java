package Strings;

import java.util.Scanner;

public class Count {

	 // 7. Count vowels, consonants, special characters, and numbers
    public static void countCharacters(String str) {
        int vowels = 0, consonants = 0, specialChars = 0, numbers = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                numbers++;
            } else if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            } else {
                specialChars++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + specialChars);
        System.out.println("Numbers: " + numbers);
}
 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        countCharacters(str);
        sc.close();
    }
}
