package tema1;

import java.util.Scanner;

public class Palindrom {

    String name = "cojoc";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti un cuvant");
        String input = scanner.nextLine();
        boolean isPalindrome = isPalindrom(input);
        System.out.println("Este palindrom: " + isPalindrome);
    }

    public static Boolean isPalindrom(String cuvant) {
        String reversed = ReverseString.reverseString(cuvant);
        if (reversed.equals(cuvant)) {
            return true;
        } else {
            return false;
        }
    }
}
