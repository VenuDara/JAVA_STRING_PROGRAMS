package Strings;

import java.util.Scanner;

public class PrintDuplicates {

	// 5. Print duplicate characters
    public static void printDuplicates(String str) {
        System.out.println("Duplicate Characters:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(i) + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        printDuplicates(str);
        sc.close();
}
}
