package Strings;

import java.util.Scanner;

public class DistinctPrint {

	// 6. Print distinct characters
    public static void printDistinct(String str) {
        System.out.println("Distinct Characters:");
        for (int i = 0; i < str.length(); i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                System.out.print(str.charAt(i) + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        printDistinct(str);
        sc.close();
}
}