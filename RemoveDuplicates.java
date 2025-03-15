package Strings;

import java.util.Scanner;

public class RemoveDuplicates {

	// 4. Remove duplicate characters
    public static void removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += str.charAt(i);
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        removeDuplicates(str);
        sc.close();
}
}
